/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crud.conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Araceli
 */
public class mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Connection conectar = null; 
    String usuario ="admin";
    String password ="RodriguezVictoria72960594";
    String bd ="crud";
    String ip ="database-12.chwkwem8slq5.us-east-1.rds.amazonaws.com";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
      Connection con = null;
        try {
           con =Drive
    }
    
}
