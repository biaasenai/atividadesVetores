package exerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(4);
        int numero = 0;
        int soma = 0;

        Scanner ler = new Scanner(System.in);

        for ( int i = 0; i <=4; i++) {
        System.out.println("Digite um número inteiro: ");
        numero = ler.nextInt();
        soma += numero;
        numeros.add(numero);
     }
         System.out.println("A soma do números é: " + soma);

        ler.close();
	}

}
