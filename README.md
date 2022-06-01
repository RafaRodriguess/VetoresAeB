# Vetores A e B
## Algoritmo e Fluxograma exercício Vetores A e B
### Algoritmo
Início

	vetorA[] = new int[5]
	vetorB[] = new int[5]
	int x, c = 0
	
	PARA(x = 0; x<5 ; x++) 
	    Escreva "Receber valor A" 
	    Leia vetorA[x]
	    Escreva "Receber valor B" 
          Leia vetorB[x]
	FIMPARA
	
	PARA(x = 1; x<5 ; x++)
	    c = c + (vetorA[x] * vetorB[x])
	FIMPARA

	Mostrar "c"

Fim

### Fluxograma
![fluxograma](https://user-images.githubusercontent.com/104536317/171484154-0674a026-db71-4352-a5ae-afaac52e20ea.png)
