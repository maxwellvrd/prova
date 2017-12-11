package prova;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
      
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um número ou 0 para parar: ");
            num = scan.nextDouble(); 
            
            if(num != 0){ 
                soma = num + soma; 
                cont++;
            }
        } while(num != 0);
        
        System.out.println("A soma é: " + soma); // soma
        System.out.println("A quantidade de números digitados foi: " + cont); // quantidade
        System.out.println("A média é:  " + soma / cont); // média
        scan.close();
    }
    
}
