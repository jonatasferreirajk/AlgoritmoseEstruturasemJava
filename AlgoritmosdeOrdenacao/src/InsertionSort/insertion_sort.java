package InsertionSort;

import java.util.Scanner;

public class insertion_sort {
	public static void main(String[] args) {
		int x[] = new int [5];
		int i, j, eleito;
		Scanner entrada = new Scanner(System.in);
		// carregando n�meros no vetor
		for (i = 0;  i <= 4; i++) {
			System.out.println("Digite o "+ (i+1)+"� n�mero:");
			x[i]= entrada.nextInt();
		}
		// ordenando de forma crescente com la�o com quantidade de elementos do vetor - 1
		for (i = 1; i <=4; i++) {
			eleito = x[i];
			j = i-1;
			//la�o que percorre o elementos � esquerda do n�mero eleito
			//ou at� encontrar a posi��o para recoloca��o do n�mero eleito respeitando a ordena��o
			while (j >= 0 && x[j] > eleito) {
				x[j+1] = x[j];
				//j = j-1;
				j--;
			}
			x[j+1] = eleito;
		}
		for (i = 0; i <= 4; i++) {
			System.out.println((i+1)+"� n�mero:"+ x[i]);
		}
	}
}
