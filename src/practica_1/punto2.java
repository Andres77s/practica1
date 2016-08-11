/*
 Escriba un algoritmo que permita calcular la hipotenusa de un triángulo 
 rectángulo utilizando el teorema de Pitágoras.
 */
package practica_1;

import java.util.Scanner;


/**
 *
 * @author Vanegas
 */
public class punto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double hipotenusa,cateto1,cateto2;
        
        System.out.print("Digite el valor del cateto 1");
        cateto1 = lector.nextInt();
        System.out.print("Digite el valor del cateto 2");
        cateto2 = lector.nextInt();
        
        hipotenusa= Math.sqrt(Math.pow(cateto1,2) + Math.pow( cateto2,2));
        System.out.print("El valor de la hipotenusa es"+hipotenusa);
        
        
    }
    
}
