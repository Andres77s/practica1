/*
 Desarrollar un programa que calcule la nota definitiva de un estudiante en una
asignatura, se sabe que durante el semestre académico se manejan tres notas con 
sus respectivos porcentajes así: seguimiento (50%), parcial I (25%) 
y parcial 2 (25%).
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author Vanegas
 */
public class punto_4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double parcial1,parcial2,seguimiento,definitiva;
        System.out.print("Digite el valor del parcial1: ");
        parcial1 = lector.nextInt();
        System.out.print("Digite el valor del parcial2: ");
        parcial2 = lector.nextInt();
        System.out.print("Digite el valor del seguimiento: ");
        seguimiento = lector.nextInt();
        
        definitiva = (parcial1 * 0.25)+(parcial2 * 0.25)+(seguimiento * 0.5); 
        System.out.print("Nota definitva: "+definitiva);
        
    }
    
}
