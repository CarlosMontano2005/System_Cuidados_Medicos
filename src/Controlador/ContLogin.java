/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author pc
 */
public class ContLogin {
    //creando atributos
     public static String usuario;
     public  String password;
     public int intententos;

  

    public int getIntententos() {
        return intententos;
    }

    public void setIntententos(int intententos) {
        this.intententos = intententos;
    }
        
  
    //Crear metodos Getter y setter  

   public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ContLogin.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public int ValidarLogin(){
        return Modelo.ModLogin.ValidarLoginResultado(usuario, password,intententos, 
                ContConfiguracion.IP,
                ContConfiguracion.Port, ContConfiguracion.Database, 
                ContConfiguracion.User, ContConfiguracion.Password);
    }
    public static String getMD5(String input) {
        try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String hashtext = number.toString(16);

        while (hashtext.length() < 32) {
        hashtext = "0" + hashtext;
        }
        return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
        }
    }
 
    
}
