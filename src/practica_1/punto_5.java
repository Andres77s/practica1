/*
 La nota final del curso de Desarrollo de aplicaciones móviles está dividido en
5 partes: Quices y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones
10%, Proyecto I 15% y Proyecto Final el 25%, desarrolle un programa en java que
permita calcular la nota final de un estudiante del curso. Después de calcular 
la nota final el programa imprimirá lo siguiente dependiendo de la nota:
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado”
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse”
d. Si la nota está entre 3.1 y 4 imprime “Normalito”
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien”
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”
 */
package practica_1;
import java.util.Scanner;
/**
 *
 * @author Vanegas
 */
public class punto_5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double QS,PL,E,PR1,PRF,DEF;
        
        System.out.print("Digite el valor de quices y seguimiento: ");
        QS = lector.nextInt();
        System.out.print("Digite el valor de practicas de laboratorio: ");
        PL = lector.nextInt();
        System.out.print("Digite el valor de las expocisines: ");
        E = lector.nextInt();
        System.out.print("Digite el valor de proyecto 1: ");
        PR1 = lector.nextInt();
        System.out.print("Digite el valor de proyecto final: ");
        PRF = lector.nextInt();
        
        DEF = (QS * 0.2)+(PL * 0.3)+(E * 0.1)+(PR1 * 0.15)+(PRF * 0.25);
        
        if(DEF >= 0 && DEF <= 1){
            System.out.print("Estas en el lugar equivocado");
        }
        else if(DEF >= 1.1 && DEF <= 2){
            System.out.print("Remal");
        }
        else if(DEF >= 2.1 && DEF <= 3){
            System.out.print("Es posible recuperarse");
        }
        else if(DEF >= 3.1 && DEF <= 4){
            System.out.print("Normalito");
        }
        else if(DEF >= 4.1 && DEF <= 4.5){
            System.out.print("Muy bien");
        }
        else if(DEF >= 4.6 && DEF <= 5){
            System.out.print("Excelente estudiante");
        }
        else {
            System.out.print("nothing");
        }
    }
}
