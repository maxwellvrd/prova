package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		// jogador

		int jogador, computador;

		Scanner scan = new Scanner(System.in);

		System.out.println("---------------------------------");
		System.out.println("|            JoKenPo            |");
		System.out.println("---------------------------------");
		System.out.println("0. Pedra");
		System.out.println("1. Papel");
		System.out.println("2. Tesoura");
		System.out.println("Digite a opção desejada: ");

		jogador = scan.nextInt();
		scan.close();

		switch (jogador) {
		case 0:

			System.out.println("O Jogador escolheu PEDRA");
			break;

		case 1:
			System.out.println("O Jogador escolheu PAPEL");
			break;

		case 2:
			System.out.println("O Jogador escolheu TESOURA");
			break;

		default:
			System.out.println("Opção invalida!");
		}

		// computador

		if (jogador <= 2) {

			Random gerador = new Random();
			computador = gerador.nextInt(2) + 1;
			/* int computador = (int) (Math.random()*2+1); */ // Aqui seria a função Math da biblioteca java

			switch (computador) {

			case 0:

				System.out.println("O Computador escolheu PEDRA");
				break;

			case 1:

				System.out.println("O Computador escolheu PAPEL");
				break;

			case 2:

				System.out.println("O Computador escolheu TESOURA");
				break;

			}

			if (jogador != computador) {

				if ((jogador == 0 && computador == 2) || (jogador == 1 && computador == 0)
						|| (jogador == 2 && computador == 1)) {
					System.out.println("O Jogador venceu!");
				} else {
					System.out.println("O Computador venceu!");
				}

			} else {
				System.out.println("Deu EMPATE!");

			}

		}
	}

}
