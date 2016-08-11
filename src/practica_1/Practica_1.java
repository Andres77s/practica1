/*
Desarrolle un algoritmo que permita calcular el volumen y el área de un cubo.
 */
package practica_1;

import java.util.Scanner;
/**
 *
 * @author Vanegas
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        double area,lado,volumen;
        System.out.print("Digite el valor del lado");
        lado = lector.nextInt();
        area = Math.pow(lado,2);
        volumen = Math.pow(lado,3);
        System.out.println("El valor del area es:"+area+"Elvolumen es"+volumen);
        
    }
    
}
