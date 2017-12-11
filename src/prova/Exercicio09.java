package prova;

public class Exercicio09 {

	public static void main(String[] args) {
		
		double fulano = 1.50;
		double ciclano = 1.10;
		int ano;
		ano = 0;
		
		while(ciclano <= fulano) {
			
			ciclano = ciclano + 0.03;
			fulano = fulano + 0.02;
			ano = ano + 1;
		}
		System.out.println(" Será necessário " + ano + " anos para que Ciclano seja maior que Fulano");
	/*	System.out.println("A altura de fulano daqui a 41 anos " + fulano); 
		System.out.println("A altura de ciclano daqui a 41 anos " + ciclano); */
	}
}
