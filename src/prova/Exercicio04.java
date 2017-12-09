package prova;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		String nome1, nome2, nome3;
		int idade1, idade2, idade3;
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1 = scan.next();
		System.out.print("Digite o nome da segunda pessoa: ");
		nome2 = scan.next();
		System.out.print("Digite o nome da terceira pessoa: ");
		nome3 = scan.next();
		System.out.print("Digite a idade da primeira pessoa: ");
		idade1 = scan.nextInt();
		System.out.print("Digite a idade da segunda pessoa: ");
		idade2 = scan.nextInt();
		System.out.print("Digite a idade da terceira pessoa: ");
		idade3 = scan.nextInt();
		
		scan.close();
		
		if ((idade1 > idade2 && idade1 > idade3) && (idade2 < idade1 && idade2 < idade3))
			System.out.println("A pessoa mais velha é o: " + nome1 + " e a pessoa mais nova é o: " +nome2);
		if ((idade1 > idade2 && idade1 > idade3) && (idade3 < idade1 && idade3 < idade2))
			System.out.println("A pessoa mais velha é o: " + nome1 + " e a pessoa mais nova é o: " +nome3);
		
		if ((idade2 > idade1 && idade2 > idade3) && (idade1 < idade2 && idade1 < idade3))
			System.out.println("A pessoa mais velha é o: " + nome2 + " e a pessoa mais nova é o: " +nome1);
		if ((idade2 > idade1 && idade2 > idade3) && (idade3 < idade1 && idade3 < idade2))
			System.out.println("A pessoa mais velha é o: " + nome2 + " e a pessoa mais nova é o: " +nome3);
		
		if ((idade3 > idade1 && idade3 > idade2) && (idade1 < idade2 && idade1 < idade3))
			System.out.println("A pessoa mais velha é o: " + nome3 + " e a pessoa mais nova é o: " +nome1);
		if ((idade3 > idade1 && idade3 > idade2) && (idade2 < idade1 && idade2 < idade3))
			System.out.println("A pessoa mais velha é o: " + nome3 + " e a pessoa mais nova é o: " +nome2);
	}
}