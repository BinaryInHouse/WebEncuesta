package tmi.app.ibk.encuesta.bean;

import java.util.Date;

public class EncuestaBean {

	private String UserID;
	private String NumLog;
	private String CodTrx;
	private String BranchID;
	private Date DateTimeBegin;
	private Date DateTimeEnd;
	private String DateTimeDiff;
	private String TimeMinutes;
	private String WorkstationID;
	private String NumRespuesta;
	private String NumTarjeta;
	private String NomCliAll;
	private String CodUnico;
	private String TipDoc;
	private String NumDoc;
	private String TipoCliente;
	private String DescTipoCliente;
	private String ApePatCliente;
	private String ApeMatCliente;
	private String NomCliente;
	
	
	public EncuestaBean() {
		
	}
	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		this.UserID = userID;
	}
	public String getNumLog() {
		return NumLog;
	}
	public void setNumLog(String numLog) {
		this.NumLog = numLog;
	}
	public String getCodTrx() {
		return CodTrx;
	}
	public void setCodTrx(String codTrx) {
		this.CodTrx = codTrx;
	}
	public String getBranchID() {
		return BranchID;
	}
	public void setBranchID(String branchID) {
		this.BranchID = branchID;
	}
	public Date getDateTimeBegin() {
		return DateTimeBegin;
	}
	public void setDateTimeBegin(Date dateTimeBegin) {
		this.DateTimeBegin = dateTimeBegin;
	}
	public Date getDateTimeEnd() {
		return DateTimeEnd;
	}
	public void setDateTimeEnd(Date dateTimeEnd) {
		this.DateTimeEnd = dateTimeEnd;
	}
	public String getTimeMinutes() {
		return TimeMinutes;
	}
	public void setTimeMinutes(String timeMinutes) {
		this.TimeMinutes = timeMinutes;
	}
	public String getDateTimeDiff() {
		return DateTimeDiff;
	}
	public void setDateTimeDiff(String dateTimeDiff) {
		this.DateTimeDiff = dateTimeDiff;
	}
	public String getWorkstationID() {
		return WorkstationID;
	}
	public void setWorkstationID(String workstationID) {
		this.WorkstationID = workstationID;
	}
	public String getNomCliAll() {
		return NomCliAll;
	}
	public void setNomCliAll(String nomCliAll) {
		this.NomCliAll = nomCliAll;
	}
	public String getNumTarjeta() {
		return NumTarjeta;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.NumTarjeta = numTarjeta;
	}
	public String getNumRespuesta() {
		return NumRespuesta;
	}
	public void setNumRespuesta(String numRespuesta) {
		this.NumRespuesta = numRespuesta;
	}
	public String getCodUnico() {
		return CodUnico;
	}
	public void setCodUnico(String codUnico) {
		this.CodUnico = codUnico;
	}
	public String getTipDoc() {
		return TipDoc;
	}
	public void setTipDoc(String tipDoc) {
		this.TipDoc = tipDoc;
	}
	public String getNumDoc() {
		return NumDoc;
	}
	public void setNumDoc(String numDoc) {
		this.NumDoc = numDoc;
	}
	public String getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.TipoCliente = tipoCliente;
	}
	public String getDescTipoCliente() {
		return DescTipoCliente;
	}
	public void setDescTipoCliente(String descTipoCliente) {
		this.DescTipoCliente = descTipoCliente;
	}
	public String getApeMatCliente() {
		return ApeMatCliente;
	}
	public void setApeMatCliente(String apeMatCliente) {
		this.ApeMatCliente = apeMatCliente;
	}
	public String getApePatCliente() {
		return ApePatCliente;
	}
	public void setApePatCliente(String apePatCliente) {
		this.ApePatCliente = apePatCliente;
	}
	public String getNomCliente() {
		return NomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.NomCliente = nomCliente;
	}
	
	 @Override
	public String toString() {
		 return "EncuestaBean{" + "UserID=" + UserID + 
				                  ", NumLog=" + NumLog + 
				                  ", CodTrx=" + CodTrx +
				                  ", BranchID=" + BranchID +
				                  ", DateTimeBegin=" + DateTimeBegin +
				                  ", DateTimeEnd=" + DateTimeEnd +
				                  ", DateTimeDiff=" + DateTimeDiff +
				                  ", TimeMinutes=" + TimeMinutes +
				                  ", WorkstationID=" + WorkstationID +
				                  ", NumRespuesta=" + NumRespuesta +
				                  ", NumTarjeta=" + NumTarjeta +
				                  ", NomCliAll=" + NomCliAll +
				                  ", CodUnico=" + CodUnico +
				                  ", TipDoc=" + TipDoc +
				                  ", NumDoc=" + NumDoc +
				                  ", TipoCliente=" + TipoCliente +
				                  ", DescTipoCliente=" + DescTipoCliente +
				                  ", ApePatCliente=" + ApePatCliente +
				                  ", ApeMatCliente=" + ApeMatCliente +
				                  ", NomCliente=" + NomCliente + '}';
	 } 
}
