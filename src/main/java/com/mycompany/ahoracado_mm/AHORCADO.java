package com.mycompany.ahoracado_mm;

import java.util.Scanner;
import java.util.Random;

public class AHORCADO {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        char[] perro = {'p', 'e', 'r', 'r', 'o'};
        char[] gato = {'g', 'a', 't', 'o'};
        char[] cangrejo = {'c', 'a', 'n', 'g', 'r', 'e', 'j', 'o'};
        int posicion = aleatorio.nextInt(3);
        int intentos = 0;
        String respuesta;
        boolean letraEncontrada = false;
        String palabras[][] = {
            {"perro", "Animmal domestico"},
            {"gato", "compañero de tom"},
            {"cangrejo", "amigo de la sirenita"}
        };
        System.out.println("cambio")
        System.out.println("Adivina el animal! " + " PISTA: " + palabras[posicion][1]);
        Scanner sc = new Scanner(System.in);
        while (letraEncontrada == false) {

            for (int i = 0; i < palabras[posicion][0].length(); i++) {
                System.out.println("Introduzca una letra: ");
                respuesta = sc.nextLine();

                if (respuesta.charAt(0) == palabras[posicion][0].charAt(i)) {
                    System.out.println("Correcto");
                    letraEncontrada = true;
                }
                intentos++;
            }
            
        }
    }
}


/*for (int i = 0; i < 10; i++) {
            
            System.out.println("Intenta adivinar el animal! ");
            if(palabraAlea == 0){
                System.out.println("_ _ _ _ _");
            }
            if(palabraAlea ==1){
                System.out.println("_ _ _ _");
            }
            if(palabraAlea ==2){
                System.out.println("_ _ _ _ _ _ _ _");
            }
            System.out.println("Diga una letra: ");
            
            for (int animal = 0; animal < 3; animal++) {
                for (int pista = 0; pista < 2; pista++) {
                    System.out.println(posicion);
                    //System.out.println(palabras[posicion][0]); 
                    
                    //palabras[animal][pista] = "_";
                }
            }
        }
        System.out.println("Numero de intentos: " + intentos);
    }*/
