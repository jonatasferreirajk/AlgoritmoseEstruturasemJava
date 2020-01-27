package PilhaEstaticaLivro;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner entrada = new Scanner(System.in); // entrada de dados a partir do teclado do usuario
		// a pilha est� vazia ent�o o primeiro valor, ou seja, o topo � NULL
		// Inser��o e Remo��o acontecem sempre no topo
		Pilha topo = null;
		//Aux � um objeto para auxiliar a pilha
		Pilha aux;
		//Menu de Op��es do Usu�rio Usando o la�o DO WHILE
		int opcao;
		do {
			System.out.println("\nMenu de Op��es - Pilha - Kingston");
			System.out.println("1 - Inserir na Pilha");
			System.out.println("2 - Consultar toda a Pilha");
			System.out.println("3 - Remover da Pilha");
			System.out.println("4 - Esvaziar a Pilha");
			System.out.println("5 - Sair");
			System.out.println("------------------------------------");
			opcao = entrada.nextInt();
			if (opcao < 1 || opcao > 5) {
				System.out.println("Op��o Inv�lida!! Tente Novamente!!!\n");
			}if (opcao == 1) {
				System.out.println("Digite o n�mero a ser Inserido na Pilha: \n");
				Pilha novo = new Pilha();
				novo.num = entrada.nextInt();
				novo.prox = topo;
				topo = novo;
				System.out.println("N�mero Inserido na Pilha com Sucesso!\n");
			}if (opcao == 2) {
				// verificando se a pilha est� vazia
				if (topo == null) {
					System.out.println("A Pilha est� Vazia!!!! Insira Elementos para Continuar!\n");
				}else {
					// a pilha tem elementos para ser mostrado do ultimo inserido a primeiro
					System.out.println("Realizando consulta a pilha...\n");
					aux = topo;
					while (aux != null) {
						System.out.println(aux.num+"");
						aux = aux.prox;
					}
				}
			}
			if (opcao == 3) {
				if(topo == null) {
					System.out.println("Pilha Vazia!\n");
				}else {
					// a pilha cont�m elementos e ser� "excluido" o ultimo elemento inserido
					System.out.println("O n�mero "+ topo.num+ " foi removido!\n");
					topo = topo.prox;
				}
				}else if(opcao == 4) {
					if (topo == null) {
						System.out.println("Erro! Pilha j� Vazia!\n");
					}else {
						// esvaziando a pilha
						topo = null;
						System.out.println("Pilha esvaziada com Sucesso!\n");
					}
				}
				if (opcao == 5) {
					System.out.println("Programa Encerrado!\n");
					break;
				}
		
		} while (opcao != 5);
	}
}
