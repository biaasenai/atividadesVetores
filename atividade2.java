package exerciciosVetor;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		int[] valores = new int[5];
        Scanner ler = new Scanner(System.in);
        int soma = 0;

         System.out.println("Informe 5 valores inteiros:");
        for (int i = 0; i < 5; i++) {
          System.out.println("Valor " + (i + 1) + ":");
        valores[i] = ler.nextInt();

        if (valores[i] > 30) {
        soma += valores[i];
        }
        }

        System.out.println("Os Valores informados:");
        for (int i = 0; i < 5; i++) {
        System.out.println("Valor na posição " + i + ": " + valores[i]);
        }

        System.out.println("A soma dos valores é: " + soma);

ler.close();

			
			
		}
	

	}


