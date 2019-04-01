package tmi.app.ibk.encuesta.persistencia.inf;

import java.sql.SQLException;
import java.util.List;

import tmi.app.ibk.encuesta.bean.EncuestaBean;

public interface EncuestaBD {

	 public List<EncuestaBean> listar(EncuestaBean encuestaBean) throws SQLException;
	    
	    public boolean insertar(EncuestaBean encuestaBean) throws SQLException;
}
