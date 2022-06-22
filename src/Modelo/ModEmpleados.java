/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import static Controlador.ContConfiguracion.Database;
import static Controlador.ContConfiguracion.IP;
import static Controlador.ContConfiguracion.Password;
import static Controlador.ContConfiguracion.Port;
import static Controlador.ContConfiguracion.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pc
 */
public class ModEmpleados {
    
    public static ResultSet CargarRegistros(){
        PreparedStatement ps;
        Connection con;
        
        try {
            con = ModConexion.getConnection(IP, Port, Database, User, Password);
            ps = con.prepareStatement("SELECT * FROM ListasEmpleados");
            ResultSet respuesta = ps.executeQuery();
            return respuesta;
        } catch (Exception e) {
            return null;
        }
    }

     
    public static ResultSet CargarTipoDocumento(){
        PreparedStatement ps;
        Connection con;
        
        try {
            con = ModConexion.getConnection(IP, Port, Database, User, Password);
            ps = con.prepareStatement("SELECT * FROM Documentos");
            ResultSet respuesta = ps.executeQuery();
            return respuesta;
        } catch (Exception e) {
            return null;
        }
    }
   
 
}
