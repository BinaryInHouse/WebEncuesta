package tmi.app.ibk.encuesta.presentacion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


import tmi.app.ibk.encuesta.bean.EncuestaBean;
import tmi.app.ibk.encuesta.persistencia.impl.EncuestaBDImpl;
import tmi.app.ibk.encuesta.persistencia.inf.EncuestaBD;

@ManagedBean(name="encuestaMB")
public class EncuestaMB {
	
	private List<EncuestaBean> lstEncuestaBeans;
	private EncuestaBean encuestaBean;
    private EncuestaBD   encuestaBD;



	@PostConstruct
	public void init () {
	    this.setLstEncuestaBeans(new ArrayList<>());      	
		this.setEncuestaBean(new EncuestaBean());
		this.listar();
	}
	
	public void listar(){
		
		System.out.println("UserID " + this.getEncuestaBean().getUserID());
		System.out.println("NumLog " + this.getEncuestaBean().getNumLog());
		try {
			lstEncuestaBeans=this.getEncuestaBD().listar(this.getEncuestaBean());
			for (EncuestaBean encuestaBean : lstEncuestaBeans) {
				System.out.println(encuestaBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<EncuestaBean> getLstEncuestaBeans() {
		return lstEncuestaBeans;
	}
	
	public void setLstEncuestaBeans(List<EncuestaBean> lstEncuestaBeans) {
		this.lstEncuestaBeans = lstEncuestaBeans;
	}
	
	
	public EncuestaBD getEncuestaBD() {
		if(this.encuestaBD == null) {
			this.encuestaBD=new EncuestaBDImpl();
		}
		return encuestaBD;
	}
	
	public EncuestaBean getEncuestaBean() {
		return encuestaBean;
	}
	public void setEncuestaBean(EncuestaBean encuestaBean) {
		this.encuestaBean = encuestaBean;
	}


}
