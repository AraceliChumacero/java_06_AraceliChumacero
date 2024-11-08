/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection conectar = null; 
    String usuario ="admin";
    String password ="RodriguezVictoria72960594";
    String bd ="crud";
    String ip ="database-12.chwkwem8slq5.us-east-1.rds.amazonaws.com";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, password);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error"+e.toString());
        }
     return conectar;
 }
}