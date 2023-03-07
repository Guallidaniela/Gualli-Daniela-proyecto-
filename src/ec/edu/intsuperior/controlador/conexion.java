/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class conexion {
   static Connection conex= null;
    public static Connection conexion() {
        String user="root";
        String passwd="guallidaniela963";
        String url= "jdbc:mysql:// localhost: 3300/ dbscfm15?serverTimezone=UTC";
        
        try {
            conex=DriverManager.getConnection(url, user,passwd);
            
            System.out.println("Conexion Exitosa");
                    
                    
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    return conex;
    
    
}
}
