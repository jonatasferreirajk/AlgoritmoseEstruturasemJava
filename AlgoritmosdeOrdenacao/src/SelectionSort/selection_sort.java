package SelectionSort;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		int X[] = new int [5];
		int i, j, eleito, menor, pos;
		Scanner entrada = new Scanner(System.in);
		//adicionando n�mero no vetor
		for (i = 0; i <= 4; i++) {
			System.out.println("Digite o "+(i+1)+" � n�mero: ");
			X[i] = entrada.nextInt();
		}
		//ordenando de forma crescente 
		//la�o que percorre da 1� posi��o at� a 3� pen�ltima posi��o do vetor
		//elegendo um n�mero para ser comparado
		for (i = 0; i <= 3; i++) {
			eleito = X[i];
			//encontrando o menor n�mero � direta do eleito com sua respectiva posi��o
			//posi��o do eleito = i
			//primeiro n�mero a direta do eleito na posi��o = i+1
			menor = X[i+1];
			pos = i+1;
			//la�o que pecorre os elementos que est�o h� direita do n�mero eleito
			//retornando o menor n�mero � direta e sua posi��o
			for (j = i+2; j <= 4; j++) {
				if(X[j] < menor) {
					menor = X[j];
					pos = j;
				}
			}
			// troca o n�mero eleito de posi��o pos
			// o n�mero da posi��o pos � o menor n�mero � direita do n�mero eleito
			if(menor < eleito) {
				X[i] = X[pos];
				X[pos] = eleito;
			}
		}
		System.out.println("Imprimindo Ordenado........");
		for (i= 0; i <= 4; i++) {
			System.out.println((i+1)+"� n�mero: "+X[i]);
		}
	}

}
