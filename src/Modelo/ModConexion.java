/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ModConexion {
    public static Connection getConnection(String IP, String Port,String Database, String USER, String Password){
         Connection con;
        try{
            String url = "jdbc:sqlserver://"+IP+":"+Port+";"
                    + "database = "+Database+";"
                    + "user = "+USER+";"
                    + "password = "+Password+";"
                    + "loginTimeOut = 30";
            con = DriverManager.getConnection(url);
            return con;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No pudo establecerse conexión con la base de datos, E001." + e.toString());
                return null;
        }
        
    }

}