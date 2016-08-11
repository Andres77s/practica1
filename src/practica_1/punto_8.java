/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;
import java.util.Scanner;
/**
 *
 * @author Vanegas
 */
public class punto_8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1,num2,opc,aux;
        
        System.out.print("digite el primer numero: ");
        num1 = lector.nextInt();
        System.out.print("digite el segundo numero: ");
        num2 = lector.nextInt();
        System.out.print("digite la opcion ");
        opc = lector.nextInt();
        
        switch(opc){
            case 0: aux=num1+num2;
                System.out.print("la suma es: "+aux);
                break;
            case 1: if(num1 > num2) {   
                System.out.print("el mayor es: "+num1);
            }
            else {
                System.out.print("el mayor es: "+num2);
            }
        }
    }
    
}
