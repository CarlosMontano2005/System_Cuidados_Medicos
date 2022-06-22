/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ContLogin;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ModLogin {
    
    public static int ValidarLoginResultado( String usuario, String clave, int Intentos, 
            String pip, String pport, String pdb, String puser, String ppassword){
            int  i = 0;
            Connection con;
            PreparedStatement ps;
            try 
            {
                con = ModConexion.getConnection(pip, pport,pdb , puser, ppassword);
                ps = con.prepareStatement("SELECT * FROM Usuarios WHERE Nombre_Usuario = ? AND Clave = ?");      
                ps.setString(1,  usuario);
                ps.setString(2, clave);
               
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    i = 1;
                    int intento = 3;
                    ps = con.prepareStatement("UPDATE Usuarios SET Intentos = '"+intento+"'");
                    ps.executeUpdate();
                }
     
                else{
                    i = 0;
                }
                return i;
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Ocurrio un error durante la verificacion de las credenciales, consulte con el administrador"+e.toString(),"Error Critico", JOptionPane.WARNING_MESSAGE);
                return  0;
            }
    }

    
        
}
