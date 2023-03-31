/*
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
 *Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
 *Informe o valor de custo de cada produto, o valor de venda de cada produto, 
 *a média de preço de custo e do preço de venda;
*/
package Exercicio03;

import  java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
     
    
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        int i = 0;
        for (; i<5; i++){
            
            System.out.println("Digite o Nome do Produto:");
            nomeProduto = scan.next();
            
            System.out.println("Digite o Custo do Produto:");
            precoCusto = scan.nextFloat();
            
            System.out.println("Digite o Preço do Produto:");
            precoVenda = scan.nextFloat();
            
            mediaCusto = mediaCusto + precoCusto;
            mediaVenda = mediaVenda + precoVenda;
            
            if (precoCusto == precoVenda){
                System.out.println(" Você não está no prejuízo e o valor está EMPATE.");
                
            } else {
                if (precoVenda > precoCusto){
                  System.out.println(" Você Obitever um Lucro de "+ ( precoVenda - precoCusto));
                    
            } else{ 
                    System.out.println(" Você está no Prejuízo de " + (precoVenda - precoCusto));
            }
                 
                }
            System.out.println(nomeProduto + " Preço do Custo = " + precoCusto + ", Preço da Venda: " + precoVenda); 
        } 
        System.out.println("A média do preço de custo é de: " + (mediaCusto / i));
        System.out.println("A média do Preço de venda é de: "+ (mediaVenda / i));
    }
}
