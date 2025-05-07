package exerciciosVetor;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[a.length + b.length];

		System.out.println("Informe 5 números inteiros para o vetor A:");
		for (int i = 0; i < a.length; i++) {
		System.out.print("Valor " + (i + 1) + ": ");
		a[i] = ler.nextInt();
		}

		System.out.println("InInforme 5 números inteiros para o vetor B:");
		for (int i = 0; i < b.length; i++) {
		System.out.print("Valor " + (i + 1) + ": ");
		b[i] = ler.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
		c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
		c[a.length + i] = b[i];
		}

		System.out.println("Os Valores no vetor C (junção de A e B):");
		for (int valor : c) {
		System.out.print(valor + " ");
		}
		System.out.println();

		ler.close();




	}
}
        
        

	


