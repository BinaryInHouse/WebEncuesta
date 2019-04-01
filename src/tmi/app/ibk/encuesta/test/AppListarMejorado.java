package tmi.app.ibk.encuesta.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import tmi.app.ibk.encuesta.util.BD;


public class AppListarMejorado {

   public static void main(String[] args) {

       Connection cn=BD.conectar();
       try {
             String sql="SELECT UserID,NumLog,CodTrx FROM Encuesta";
             Statement st= cn.createStatement();
             ResultSet rs= st.executeQuery(sql);
             while(rs.next()){
                 System.out.println(rs.getString("UserID"));
                 System.out.println(rs.getString("NumLog"));
                 System.out.println(rs.getString("CodTrx"));
             }
       } catch (Exception e) {
            System.err.println("Error al consultar "+ e.getMessage());
       }

       
    }
    
}
