/*
 Una oficina de seguros ha reunido datos concernientes a todos los accidentes de
tránsito ocurridos en el área metropolitana en el último año. Por cada conductor
involucrado en un accidente se toman los siguientes datos: año de nacimiento, 
sexo (1: Femenino, 2: Masculino), registro del carro 
(1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años
b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.
 */
package practica_1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Vanegas
 */
public class punto_7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nacimiento=0,sexo=0,registro=0,aux1=0,aux2=0,aux3=0,aux4=0,aux5=0,
                aux6=0,aux7=0,aux8=0,aux9=0,aux10=0;
        boolean infi = true;
        while (infi){
        System.out.print("\ndigite \n1) para un nuevo accidente\n "
                + "2) El porcentaje de conductores menores de 25 años\n" +
                  "3) El porcentaje de conductores del sexo femenino.\n" +
                  "4) El Porcentaje de conductores cuyos carros están "
                + "registrados fuera de Medellín. \n");        
        aux1 = lector.nextInt();
        
        if(aux1 == 1){
            nacimiento+=1;
            sexo+=1;
            registro+=1;
        System.out.print("Digite año de nacimiento: ");
        aux5 = lector.nextInt();
            if(aux5 > 1991){
                aux6+=1;
            }            
        System.out.print("Digite el sexo del conductor: 1->femenino 2->masculino ");
        aux7 = lector.nextInt();
            if(aux7==1){
                aux8+=1;
            }        
        System.out.print("Digite el registro del carro: 1->Medellin 2->otros");
        aux9 = lector.nextInt();
            if(aux9==2){
                aux10+=1;
            }
        }
        else if(aux1 == 2){
            float p1;
            p1=(aux6*100)/nacimiento;
            DecimalFormat df = new DecimalFormat("0.00"); 
                System.out.print("El porcentaje de conductores menores de 25 años:"
                    +df.format(p1));            
        }
        else if(aux1==3){
            System.out.print("El porcentaje de conductores del sexo femenino."
                    +aux3);
                
        }
        else if(aux1==3){
            System.out.print("El Porcentaje de conductores cuyos carros están "
                + "registrados fuera de Medellín."+aux4);
        }
        else {
            System.out.print("nothing");
        }
    }
    }
}












