/*
 * EXERCICIO01:
 * Faça um algoritmo que receba um número e diga se este número 
 * está no intervalo entre 100 e 200;.
 */
package Exercicios01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero;

        Scanner leitorScanner = new Scanner(System.in);
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
           System.out.println("o número está estar no intervalo"); 
        } else{
          System.out.println("O número não está no intervalo"); 
        }
    }

}
