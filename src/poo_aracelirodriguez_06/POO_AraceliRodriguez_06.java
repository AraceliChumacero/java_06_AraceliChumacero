/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aracelirodriguez_06;



/**
 *
 * @author CESCIA
 */
public class POO_AraceliRodriguez_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        int  r = 5;
        Operaciones op1 = new Operaciones();
        resultado = op1.suma(5, 30);
      
        
         System.out.println("la suma es:  " + resultado);
        System.out.println("la resta es :  " + op1.resta(60, 28));
        System.out.println("El area del cirulo con radio "     +   r  +    "es"   +   op1.areaCirculo(r));
    }

}
