package exerciciosVetor;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		String[] nomes = new String[4];
		for (int i = 0; i < 4; i++) {
		System.out.print("Digite o nome: ");
		nomes[i] = ler.nextLine();
		}
		System.out.println("Nomes digitados:");
		for (int i = 0; i < 4; i++) {
		System.out.println(nomes[i]);
		}

		ler.close();
		}
		}
