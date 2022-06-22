/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModConexion;
import java.sql.Connection;
public class ContConexion {
       public static Connection getConnectionController(){
         return ModConexion.getConnection(ContConfiguracion.IP, ContConfiguracion.Port, 
                ContConfiguracion.Database,ContConfiguracion.User, ContConfiguracion.Password);
    }
}
