package tmi.app.ibk.encuesta.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BD {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost\\SBD:8022; Database=tm41Encuesta";
    

    private static boolean cargarDriver() {
        try {
            Class.forName(BD.driver);
            System.out.println("Exito al cargar el driver");
            return true;
        } catch (Exception e) {
            System.err.println("Error al cargar el driver " + e.getMessage());
            return false;
        }
    }

    private static boolean cargarDriver(String driver) {
        try {
            BD.driver = driver;
            Class.forName(BD.driver);
            System.out.println("Exito al cargar el driver");
            return true;
        } catch (Exception e) {
            System.err.println("Error al cargar el driver " + e.getMessage());
            return false;
        }
    }

    public static Connection conectar() {
        if (!BD.cargarDriver()) {
            return null;
        }
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, "sa", "m3c04816");
            System.out.println("Exito al conectar bd");
        } catch (Exception e) {
            System.err.println("Error al conectar bd " + e.getMessage());
        }
        return cn;
    }
    
     public static Connection conectar(String usuario, String clave) {
        if (!BD.cargarDriver()) {
            return null;
        }
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Exito al conectar bd");
        } catch (Exception e) {
            System.err.println("Error al conectar bd " + e.getMessage());
        }
        return cn;
    }
}
