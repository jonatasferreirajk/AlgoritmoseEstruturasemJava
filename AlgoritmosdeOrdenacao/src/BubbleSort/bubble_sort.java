package BubbleSort;

import java.util.Scanner;

public class bubble_sort {
	public static void main(String[] args) {
		int x[] = new int [5];
		int n, i , aux;
		Scanner entrada = new Scanner(System.in);
		for (i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			x[i] = entrada.nextInt();
		}
		for (n = 1; n <=5; n++) {
			for (i = 0; i <= 3; i++) {
				if(x[i] > x[i+1]) {
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
		}
		System.out.println("Ordenando................");
		for (i = 0; i <= 4; i++) {
			System.out.println((i+1) + "º número: " + x[i]);
		}
	}
}
