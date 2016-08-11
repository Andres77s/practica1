/*
 En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con
los números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, 
respectivamente. Defina un algoritmo que lea el número de producto que ingresa 
el usuario y que le muestre su precio.
 */
package practica_1;
import java.util.Scanner;
/**
 *
 * @author Vanegas
 */
public class Punto_6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int producto;
        
        System.out.print("Digite el numero del producto: ");
        producto = lector.nextInt();
        
        if(producto == 1){
            System.out.print("El valor del producto es de $500");
        }
        else if(producto == 2){
            System.out.print("El valor del producto es de $800");
        }
        else if(producto == 3){
            System.out.print("El valor del producto es de $300");
        }
        else if(producto == 4){
            System.out.print("El valor del producto es de $900");
        }
         else {
            System.out.print("nothing");
        }    
      
    }
    
}
