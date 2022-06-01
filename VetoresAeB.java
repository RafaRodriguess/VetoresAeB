package FACENSlistaFinal;

import java.util.Scanner;

public class VetoresAeB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// vetores com 5 posições com entradas já definidas no exercício
		// vetor a {4, 6, 7, 1, 0}
		int vetorA[] = new int[5];
		// vetor b {7, 1, 3, 1, 2}
		int vetorB[] = new int[5];
		// Variáveis x e c.
		int x;
		int c = 0;
		// repetição for para receber os vetores
		for (x = 0; x < 5; x++) {
			// printa a informação
			System.out.printf("Receber A: ");
			// recebe o valor no vetor x
			vetorA[x] = sc.nextInt();
			System.out.printf("Receber B: ");
			vetorB[x] = sc.nextInt();
		}
		// repetição for para fazer o calculo da variável c
		// x começa valendo 1, seguindo as informações do fluxogama
		for (x = 1; x < 5; x++) {
			// calculando c
			c = c + (vetorA[x] * vetorB[x]);
		}
		// print mostrando resultado da var c
		System.out.print(c);

		sc.close();
	}
}
