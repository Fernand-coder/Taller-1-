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
        
        arr[0]= "Primer mes : Enero";
        arr[1]= "Segundo mes: Febrero";
        arr[2]= "Tercer mes: Marzo";
        arr[3]= "Cuarto mes: Abril";
        arr[4]= "Quinto mes: Mayo";
        arr[5]= "Sexto mes: Junio";
        arr[6]= "Septimo mes: Julio";
        arr[7]= "Octavo mes: Agosto";
        arr[8]= "Noveno mes: Septiembre";
        arr[9]=  "Decimo mes: Octubre";
        arr[10]= "Onceavo mes: Noviembre";
        arr[11]= "Doceavo mes: Diciembre";
        
        
        for(int i=0; i<arr.length;i++){
            System.out.println("En la posicion " +i+" esta el -- "+arr[i]);
        }
    }
    
}
