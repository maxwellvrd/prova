package prova;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
      
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um n�mero: ");
            num = scan.nextDouble(); 
            
            if(num != 0){ 
                soma = num + soma; 
                cont++;
            }
        } while(num != 0);
        
        System.out.println("A soma �: " + soma); // soma
        System.out.println("A quantidade de n�meros digitados foi: " + cont); // quantidade
        System.out.println("A m�dia �:  " + soma / cont); // m�dia
        scan.close();
    }
    
}