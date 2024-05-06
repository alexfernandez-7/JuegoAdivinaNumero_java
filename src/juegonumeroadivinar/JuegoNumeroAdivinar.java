/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonumeroadivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JuegoNumeroAdivinar {

    //public final int MAX_INTENTOS=4;
    public static void main(String[] args) {
        //declaramos inicializmos tres variables de tipo entero
        int numero=0, aleatorio, intentos = 0;

        Scanner entrada = new Scanner(System.in);

        aleatorio = (int) (Math.random()* 10);//todo lo que genere la clase variablr random se almacenara en aleatorio

        System.out.println("*****BIENVENIDO AL JUEGO DE ADIVINA UN NUMERO************");//MENSAJE DE BIENVENIDA
        do {
            
            try{
            System.out.println("por favor teclee un numero del 1 al 10:");

            numero = entrada.nextInt();
            

            intentos++;//aqui los intentos se iran incrementando en 1

            if (numero < aleatorio) {
                System.out.println("el numero buscado es mas Alto...");

            } else if (numero > aleatorio) {
                System.out.println("el numero busacdo es mas bajo...");
            }
            }catch(InputMismatchException e){
                entrada.nextLine();
                System.err.println("error");
                
            }
            

        } while (numero != aleatorio);//el bucle du while se usa mientras esta condicion se repita o no se repita se seguira ejecutando

        System.out.println("premio!el numero buscado es el " + aleatorio);
        System.out.println("lo ha conseguido en : " + intentos + " intentos. ");

    }

}
