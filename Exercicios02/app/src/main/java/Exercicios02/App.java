/*
 * Faça um algoritmo que receba “N” números e mostre positivo, 
 * negativo ou zero para cada número;
 */
package Exercicios02;

    import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
        
    Scanner leitorScanner = new Scanner(System.in); 
        
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar =='s' ) {
    
                    System.out.println("digite um numero: ");
                
                int numero = leitorScanner.nextInt();
        
                if (numero == 0){
                    
                     System.out.println("o valor é zero");
                } 
                  else{
                    
                 if (numero > 0){
                    System.out.println("o valor é positivo");
                } 
                 else{
                    System.out.println("O valor é negativo");
       }
   }
                    System.out.println("Deseja Continuar: 'S' - Sim ou 'N' - Não ");
                    desejaContinuar = leitorScanner.next().charAt(0);
    
}    
    }
}
