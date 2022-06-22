/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModEmpleados;
import Vista.FrmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class ContEmpleados {

   public static int  Id_Empleado;
   public static  String Apellido_Empleado;
   public static String Nombre_Empleado;
    public static String Fecha_Na;
  public static  String Direccion;
   public static String NIT;
    public static int Id_Tipo_Documento;
  public static  String Documento;
   public static int Id_Genero;
    public static int Id_Estadi_Civil;
   public static  int Id_Empresa;
    //Construcutor

  
   
    public ContEmpleados(int Id_Empleado, String Apellido_Empleado, String Nombre_Empleado, String Fecha_Na, String Direccion, String NIT, int Id_Tipo_Documento, String Documento, int Id_Genero, int Id_Estadi_Civil, int Id_Empresa) {
        this.Id_Empleado = Id_Empleado;
        this.Apellido_Empleado = Apellido_Empleado;
        this.Nombre_Empleado = Nombre_Empleado;
        this.Fecha_Na = Fecha_Na;
        this.Direccion = Direccion;
        this.NIT = NIT;
        this.Id_Tipo_Documento = Id_Tipo_Documento;
        this.Documento = Documento;
        this.Id_Genero = Id_Genero;
        this.Id_Estadi_Civil = Id_Estadi_Civil;
        this.Id_Empresa = Id_Empresa;
    }
    
    //Metodo get y sett
    public static int getId_Empleado() {
        return Id_Empleado;
    }

    public static void setId_Empleado(int Id_Empleado) {
        ContEmpleados.Id_Empleado = Id_Empleado;
    }

    public static String getApellido_Empleado() {
        return Apellido_Empleado;
    }

    public static void setApellido_Empleado(String Apellido_Empleado) {
        ContEmpleados.Apellido_Empleado = Apellido_Empleado;
    }

    public static String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public static void setNombre_Empleado(String Nombre_Empleado) {
        ContEmpleados.Nombre_Empleado = Nombre_Empleado;
    }

    public static String getFecha_Na() {
        return Fecha_Na;
    }

    public static void setFecha_Na(String Fecha_Na) {
        ContEmpleados.Fecha_Na = Fecha_Na;
    }

    public static String getDireccion() {
        return Direccion;
    }

    public static void setDireccion(String Direccion) {
        ContEmpleados.Direccion = Direccion;
    }

    public static String getNIT() {
        return NIT;
    }

    public static void setNIT(String NIT) {
        ContEmpleados.NIT = NIT;
    }

    public static int getId_Tipo_Documento() {
        return Id_Tipo_Documento;
    }

    public static void setId_Tipo_Documento(int Id_Tipo_Documento) {
        ContEmpleados.Id_Tipo_Documento = Id_Tipo_Documento;
    }

    public static String getDocumento() {
        return Documento;
    }

    public static void setDocumento(String Documento) {
        ContEmpleados.Documento = Documento;
    }

    public static int getId_Genero() {
        return Id_Genero;
    }

    public static void setId_Genero(int Id_Genero) {
        ContEmpleados.Id_Genero = Id_Genero;
    }

    public static int getId_Estadi_Civil() {
        return Id_Estadi_Civil;
    }

    public static void setId_Estadi_Civil(int Id_Estadi_Civil) {
        ContEmpleados.Id_Estadi_Civil = Id_Estadi_Civil;
    }

    public static int getId_Empresa() {
        return Id_Empresa;
    }

    public static void setId_Empresa(int Id_Empresa) {
        ContEmpleados.Id_Empresa = Id_Empresa;
    }
    //------------------- Cargar Tabla 
    public static ResultSet CargarEmpleado(){
            return ModEmpleados.CargarRegistros();
    }
    //Cargar Tipo documento CMB
    public static ResultSet CargarTipoDocumento(){
            return ModEmpleados.CargarTipoDocumento();
    }
   
}
