package prova;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		double saldo, valor;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor do saldo m�dio: ");
		saldo = scan.nextDouble();
		scan.close();
		
		if((saldo >= 0) && saldo <=200) {
			System.out.println("Voc� n�o tem cr�dito para a opera��o");
		}
		if ((saldo >= 201) && (saldo <= 400)){
			
			valor = (saldo*0.2);
			System.out.println("O seu limite  de cr�dito �: " + valor);
			
		}
		if ((saldo >= 401) && (saldo <= 600)){
			
			valor = (saldo*0.3);
			System.out.println("O seu limite  de cr�dito �: " + valor);
			
		}
		if(saldo >= 601) {
			valor = (saldo*0.4);
			System.out.println("O seu limite de cr�dito �: " +valor);
		}
		
		
	}
}
