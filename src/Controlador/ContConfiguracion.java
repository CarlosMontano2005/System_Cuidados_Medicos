/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author pc
 */
public class ContConfiguracion {
    public static String IP;
    public static String Port;
    public static String Database;
    public static String User;
    public static String Password;
      public static String getIP() {
        return IP;
    }

    public static void setIP(String IP) {
        ContConfiguracion.IP = IP;
    }

    public static String getPort() {
        return Port;
    }

    public static void setPort(String Port) {
        ContConfiguracion.Port = Port;
    }

    public static String getDatabase() {
        return Database;
    }

    public static void setDatabase(String Database) {
        ContConfiguracion.Database = Database;
    }

    public static String getUser() {
        return User;
    }

    public static void setUser(String User) {
        ContConfiguracion.User = User;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        ContConfiguracion.Password = Password;
    }
}
