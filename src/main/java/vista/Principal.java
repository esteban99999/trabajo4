/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.PaisControl;
import controlador.ProvinciaControl;

/**
 *
 * @author esteb
 */
public class Principal {
    public static void main(String[] args) {
        
      var provinciaControl = new ProvinciaControl();
        var data = new String[10];
        data[0] = "01";
        data[1] = "AZUAY";
        data[2] = "A";
        data[3] = "Cuenca";
        data[4] = "Deportivo Cuenca";
       
        //pais
        data[5] = "01";
        data[6] = "500000";
        data[7] = "Ecuador";
        data[8] = "America";
        data[9] = "Ecuatoriano";
        
        //pais
        var paisControl = new PaisControl();
        var dato1 = new String[5];
        dato1[0] = "01";
        dato1[1] = "500000";
        dato1[2] = "Ecuador";
        dato1[3] = "America";
        dato1[4] = "Ecuatoriano";
        
        System.out.println(provinciaControl.crear(data));
        System.out.println(paisControl.crear(dato1));
        System.out.println("-------------------------------"); 
       
    }
}
