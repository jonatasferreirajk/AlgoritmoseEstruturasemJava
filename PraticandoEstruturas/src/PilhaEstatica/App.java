package PilhaEstatica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner entrada = new Scanner(System.in);
		Pilha topo = null;
		Pilha aux;
		
		int opcao;
		do {
			System.out.println("\nMENU - PILHA ESTÁTICA\n");
			System.out.println("1 - Inserir na Pilha");
			System.out.println("2 - Imprimir Toda a Pilha");
			System.out.println("3 - Remover Elemento da Pilha");
			System.out.println("4 - Remover Todos os Elementos da Pilha");
			System.out.println("5 - Encerrar Pilha");
			System.out.println("------------------------------------------");
			opcao = entrada.nextInt();
			if(opcao < 1 || opcao > 5) {
				System.out.println("Opção Inválida :( Tente Novamente! ");
			}
			if(opcao == 1) {
				System.out.println("Digite o Elemento a Ser Inserido na Pilha: ");
				Pilha novo = new Pilha();
				novo.numero = entrada.nextInt();
				novo.prox = topo;
				topo = novo;
				System.out.println("Elemento Inserido com Sucesso! :D");
			}
			if(opcao == 2) {
				if(topo == null) {
					System.out.println("Pilha Vazia! Insira Elemento e Tente Novamente!");
				}else {
					System.out.println("Imprimindo Pilha...");
					aux = topo;
					while (aux != null) {
						System.out.println(aux.numero+"");
						aux = aux.prox;
					}
				}
			}
				if(opcao == 3) {
					if(topo == null) {
						System.out.println("Erro! Pilha Vazia!!");
					}else {
						System.out.println("O Elemento Nº "+topo.numero+" foi removido!");
						topo = topo.prox;
					}
				}else if(opcao == 4) {
						if(topo == null) {
							System.out.println("Erro! não existe elementos para serem excluídos!");
						}else {
							topo = null;
							System.out.println("Pilha Esvaziada com Sucesso! :D");
						}
						
					}
				if(opcao == 5) {
					System.out.println("Fim do Programa!");
					break;
				}
			
			}
		 while (opcao != 5);
		}
}

