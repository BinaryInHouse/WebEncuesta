package tmi.app.ibk.encuesta.test;

import java.util.List;

import tmi.app.ibk.encuesta.bean.EncuestaBean;
import tmi.app.ibk.encuesta.persistencia.impl.EncuestaBDImpl;
import tmi.app.ibk.encuesta.persistencia.inf.EncuestaBD;




public class AppListarMejoradoBD {

   public static void main(String[] args) {

       EncuestaBD encuestaBD= new EncuestaBDImpl();
       try {
          List<EncuestaBean> lstEncuestaBeans=encuestaBD.listar(new EncuestaBean()); 
    	   for (EncuestaBean encuestaBean : lstEncuestaBeans) {
                   System.out.println(encuestaBean);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    
}
