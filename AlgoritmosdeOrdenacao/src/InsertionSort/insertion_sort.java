package InsertionSort;

import java.util.Scanner;

public class insertion_sort {
	public static void main(String[] args) {
		int x[] = new int [5];
		int i, j, eleito;
		Scanner entrada = new Scanner(System.in);
		// carregando números no vetor
		for (i = 0;  i <= 4; i++) {
			System.out.println("Digite o "+ (i+1)+"º número:");
			x[i]= entrada.nextInt();
		}
		// ordenando de forma crescente com laço com quantidade de elementos do vetor - 1
		for (i = 1; i <=4; i++) {
			eleito = x[i];
			j = i-1;
			//laço que percorre o elementos á esquerda do número eleito
			//ou até encontrar a posição para recolocação do número eleito respeitando a ordenação
			while (j >= 0 && x[j] > eleito) {
				x[j+1] = x[j];
				//j = j-1;
				j--;
			}
			x[j+1] = eleito;
		}
		for (i = 0; i <= 4; i++) {
			System.out.println((i+1)+"º número:"+ x[i]);
		}
	}
}
