package Fila;

import java.util.Scanner;

public class AppFila {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		FILA inicio = null;
		FILA fim = null;
		FILA aux;
		int op;
		do {
			System.out.println("-----------------FILA--------------------");
			System.out.println("1 - Inserir Nº na Fila");
			System.out.println("2 - Imprimir toda a Fila");
			System.out.println("3 - Remover Nº da Fila");
			System.out.println("4 - Esvaziar a Fila");
			System.out.println("5 - Sair");
			System.out.println("-----------------------------------------");
			System.out.println("\nDigite a opção desejada: ");
			op = entrada.nextInt();
			if(op < 1 || op > 5) {
				System.out.println("Opção inválida! Tente Novamente!");
			}
			if(op == 1) {
				System.out.println("Digite o Nº a ser inserido na Fila: ");
				FILA novo = new FILA();
				novo.num = entrada.nextInt();
				novo.prox = null;
				if(inicio == null) {
					inicio = novo;
					fim = novo;
				}else {
					fim.prox = novo;
					fim = novo;
				}
				System.out.println("Nº inserido com Sucesso na Fila!");
			}
			if(op == 2) {
				if(inicio == null) {
					System.out.println("Fila Vazia! Não há nada para Imprimir!");
				}else {
					System.out.println("Imprimindo a Fila...");
					aux = inicio;
					while (aux != null) {
						System.out.println(aux.num + "");
						aux = aux.prox;
					}
				}
			}
			if(op == 3) {
				if(inicio == null) {
					System.out.println("A fila está vazia! Nada para Remover!");
				}else {
					System.out.println("O Nº " + inicio.num + " foi removido com Sucesso!" );
					inicio = inicio.prox;
				}
			}
			if(op == 4) {
				if(inicio == null) {
					System.out.println("A fila está vazia! Nada para Remover!");
				}else {
					inicio = null;
					System.out.println("Fila esvaziada com Sucesso!");
				}
			}
		} while (op != 5);

	}

}
