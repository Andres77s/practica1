/*
Dado el valor del lado de un triángulo equilátero, haga un algoritmo que calcule
su perímetro, su altura y su área.
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author Vanegas
 */
public class punto_3 {
    public static void main(String[] args) {        
        Scanner lector = new Scanner(System.in);
        
        double lado,perimetro,altura,area;
        
        System.out.print("Digite el valor del lado del triangulo:");
        lado = lector.nextInt();
        
        perimetro = 3*lado;
        altura = (Math.sqrt(3)/2)*lado;
        area = (Math.sqrt(3)/4) * Math.pow(lado,2);
        System.out.print("altura: "+altura+" \n perimetro: "+perimetro+
                "\n area:"+area);
        
    }
    
}
