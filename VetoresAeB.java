package FACENSlistaFinal;

import java.util.Scanner;

public class VetoresAeB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// vetores com 5 posi��es com entradas j� definidas no exerc�cio
		// vetor a {4, 6, 7, 1, 0}
		int vetorA[] = new int[5];
		// vetor b {7, 1, 3, 1, 2}
		int vetorB[] = new int[5];
		// Vari�veis x e c.
		int x;
		int c = 0;
		// repeti��o for para receber os vetores
		for (x = 0; x < 5; x++) {
			// printa a informa��o
			System.out.printf("Receber A: ");
			// recebe o valor no vetor x
			vetorA[x] = sc.nextInt();
			System.out.printf("Receber B: ");
			vetorB[x] = sc.nextInt();
		}
		// repeti��o for para fazer o calculo da vari�vel c
		// x come�a valendo 1, seguindo as informa��es do fluxogama
		for (x = 1; x < 5; x++) {
			// calculando c
			c = c + (vetorA[x] * vetorB[x]);
		}
		// print mostrando resultado da var c
		System.out.print(c);

		sc.close();
	}
}
