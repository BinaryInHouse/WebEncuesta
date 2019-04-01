package tmi.app.ibk.encuesta.persistencia.impl;

import java.util.ArrayList;
import java.util.List;



import java.sql. *;


import tmi.app.ibk.encuesta.bean.EncuestaBean;
import tmi.app.ibk.encuesta.persistencia.inf.EncuestaBD;
import tmi.app.ibk.encuesta.util.BD;

public class EncuestaBDImpl implements EncuestaBD{
	
	@Override
	public List<EncuestaBean> listar( EncuestaBean encuestaBean) throws SQLException{
		
		 Connection cn=BD.conectar();
	       List<EncuestaBean> lstEncuestaBeans= new ArrayList<>();
	       try {
	           /*  String sql="SELECT UserID,NumLog,CodTrx,BranchID, DateTimeBegin FROM Encuesta"
	              		+ " WHERE UPPER(BranchID) LIKE '%'+ UPPER(?)+'%'";
	             PreparedStatement ps = cn.prepareStatement(sql);
	             ps.setString(1, encuestaBean.getBranchID());
	             ResultSet rs= ps.executeQuery();*/
	             String sql="SELECT * FROM Encuesta";
	             Statement st= cn.createStatement();
	             ResultSet rs= st.executeQuery(sql);
	             
	             while(rs.next()){
	                 EncuestaBean oEncuestaBean= new EncuestaBean();
	                 oEncuestaBean.setUserID(rs.getString("UserID"));
	                 oEncuestaBean.setNumLog(rs.getString("NumLog"));
	                 oEncuestaBean.setCodTrx(rs.getString("CodTrx"));
	                 oEncuestaBean.setBranchID(rs.getString("BranchID"));
	                 oEncuestaBean.setDateTimeBegin(rs.getDate("DateTimeBegin"));
	                 oEncuestaBean.setDateTimeEnd(rs.getDate("DateTimeEnd"));
	                 oEncuestaBean.setTimeMinutes(rs.getString("TimeMinutes"));
	                 oEncuestaBean.setDateTimeDiff(rs.getString("DateTimeDiff"));
	                 oEncuestaBean.setWorkstationID(rs.getString("WorkstationID"));
	                 oEncuestaBean.setNomCliAll(rs.getString("NomCliAll"));
	                 oEncuestaBean.setNumTarjeta(rs.getString("NumTarjeta"));
	                 oEncuestaBean.setNumRespuesta(rs.getString("NumRespuesta"));
	                 oEncuestaBean.setCodUnico(rs.getString("CodUnico"));
	                 oEncuestaBean.setTipDoc(rs.getString("TipDoc"));
	                 oEncuestaBean.setNumDoc(rs.getString("NumDoc"));
	                 oEncuestaBean.setTipoCliente(rs.getString("TipoCliente"));
	                 oEncuestaBean.setDescTipoCliente(rs.getString("DescTipoCliente"));
	                 oEncuestaBean.setApePatCliente(rs.getString("ApePatCliente"));
	                 oEncuestaBean.setApeMatCliente(rs.getString("ApeMatCliente"));
	                 oEncuestaBean.setNomCliente(rs.getString("NomCliente"));
	                 
	                 
	                 lstEncuestaBeans.add(oEncuestaBean);
	             }
	             rs.close();
	             st.close();
	             cn.close();
	             
	       } catch (Exception e) {
	            System.err.println("Error al consultar "+ e.getMessage());
	            throw e;
	       } 
	        
	        return lstEncuestaBeans; 
	}
	
	   @Override
	    public boolean insertar(EncuestaBean encuestaBean) throws SQLException {
	     Connection cn=BD.conectar();
	       boolean sw=false;
	       try {
	             String sql="INSERT INTO Encuesta(UserID,NumLog,CodTrx)" +
	                        "VALUES(NEXTVAL,?,?)";
	            PreparedStatement ps= cn.prepareStatement(sql);
	            ps.setString(1, encuestaBean.getUserID());
	            ps.setString(2, encuestaBean.getBranchID());
	            
	            ps.executeUpdate();
	            sw=true;
	       } catch (SQLException e) {
	            System.err.println("Error al consultar "+ e.getMessage());
	            throw e;
	       } 
	        return sw;   }
	 

}
