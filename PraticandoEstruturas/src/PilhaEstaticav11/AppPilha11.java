package PilhaEstaticav11;

import java.util.Scanner;

public class AppPilha11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pilha topo = null;
		Pilha aux;
		
		int opcao;
		do {
			System.out.println("--------Pilha v1.1----------");
			System.out.println("1 - Inserir N� na Pilha");
			System.out.println("2 - Imprimir Toda Pilha");
			System.out.println("3 - Remover um N� da Pilha");
			System.out.println("4 - Esvaziar toda Pilha");
			System.out.println("5 - Sair");
			System.out.println("Digite a op��o desejada: ");
			opcao = entrada.nextInt();
			if(opcao < 1 || opcao > 5) {
				System.out.println("Op��o de menu inv�lida! Tente Novamente!");
			}
			if(opcao == 1) {
				System.out.println("Digite o N� a ser inserido na pilha: ");
				Pilha novo = new Pilha();
				novo.num = entrada.nextInt();
				novo.prox = topo;
				topo = novo;
				System.out.println("N�mero Inserido na pilha com Sucesso!");
			}
			if(opcao == 2) {
				if(topo == null) {
					System.out.println("N�o h� nada para Imprimir! Pilha Vazia!");
				}else {
					System.out.println("Realizando Consulta na Pilha.... ");
					aux = topo;
					while(aux != null) {
						System.out.println(aux.num+"");
						aux = aux.prox;
					}
				}
			}
			if(opcao == 3) {
				if(topo == null) {
					System.out.println("N�o h� nada para remover! Pilha Vazia!");
				}
				else {
					System.out.println("N� "+ topo.num +"foi removido da pilha!");
					topo = topo.prox;
				}
			}else if(opcao == 4) {
				if(topo == null) {
					System.out.println("N�o h� nada para remover! Pilha Vazia!");
				}else {
					topo = null;
					System.out.println("Pilha esvaziada com Sucesso!");
				}
			}if(opcao == 5) {
				System.out.println("Programa de Pilha Encerrado! xD");
				break;
			}
			
		} while (opcao != 5);

	}

}
