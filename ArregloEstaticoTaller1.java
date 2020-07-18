/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloestaticotaller1;

/**
 *
 * @author Fernando Padilla
 */
public class ArregloEstaticoTaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare un array para los mese del año 
        System.out.println("          UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE   ");
        System.out.println("Apellidosy Nombres: \n-Padilla Castro Fernando Jose ");
        System.out.println("Materia: Programacion [7450]\n");
        
       System.out.println("   -MESES DEL AÑO-    \n");
        String [] arr;
        
        arr = new String[12];
        
        arr[0]= " Enero";
        arr[1]= " Febrero";
        arr[2]= "Marzo";
        arr[3]= " Abril";
        arr[4]= " Mayo";
        arr[5]= " Junio";
        arr[6]= " Julio";
        arr[7]= " Agosto";
        arr[8]= " Septiembre";
        arr[9]=  " Octubre";
        arr[10]= " Noviembre";
        arr[11]= " Diciembre";
        
        
        for(int i=0; i<arr.length;i++){
            System.out.println("En la posicion " +i+" esta el mes de: "+arr[i]);
        }
    }
    
}
