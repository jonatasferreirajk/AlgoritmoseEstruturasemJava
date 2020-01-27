package PilhaEstaticaSwitch;

import java.util.Scanner;

public class AppSwitch {

	public static void main(String[] args) {
		Pilha topo = null;
		Pilha aux;
		Scanner entrada = new Scanner(System.in);
		int opcao;
		System.out.println("--------------------------");
		System.out.println("Pilha Estática - JK");
		System.out.println("1 - Inserir na Pilha");
		System.out.println("2 - Imprimir Elementos");
		System.out.println("3 - Excluir uma Elemento da Pilha");
		System.out.println("4 - Limpar Toda Pilha");
		System.out.println("5 - Fechar");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite Valor a ser Inserido na Pilha: \n");
			Pilha novo = new Pilha();
			novo.numero = entrada.nextInt();
			novo.prox = topo;
			topo = novo;
			break;
		case 2:
			if(topo == null) {
				System.out.println("Pilha vazia, nada para Imprimir!");
			}
			System.out.println("Imprimindo Pilha...");
				aux = topo;
				while (aux != null) {
					System.out.println(aux.numero+" ");
					aux = aux.prox;
				}
				break;
		case 3:
			if(topo == null) {
				System.out.println("Erro, Nenhum Elemento para ser Excluido!");
			}
			System.out.println("Elemento "+ topo.numero+" removido!");
			topo = topo.prox;
			break;
		case 4:
			if(topo == null) {
				System.out.println("Erro, Pilha Vazia!");
			}
			topo = null;
			System.out.println("Pilha Esvaziada com Sucesso!");
			break;
		case 5:
			System.out.println("Programa Encerrado!");
			break;
		default:
			System.out.println("Número Digitado não existe no Menu, TENTE NOVAMENTE!");
			break;
		}

	}

}
