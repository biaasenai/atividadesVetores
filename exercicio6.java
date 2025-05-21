package exerciciosVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(4);
        int quantidade;
        int numero;

        System.out.println("Determine quantos números deseja conferir: ");
        quantidade = ler.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe um número: ");
            numero = ler.nextInt();
            numeros.add(numero);

            if (numeros.get(i) >= 0) {
                System.out.println("O número " + numeros.get(i) + " é positivo");
            } else {
                System.out.println("O número " + numeros.get(i) + " é negativo");
            }
        }

        System.out.println("Todos os números foram conferidos!");
        ler.close();
	}

}
