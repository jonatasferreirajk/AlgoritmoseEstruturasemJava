package FilaEstaticaLivro;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// a fila est� vazia ent�o o �nicio � NULO
		// a remo��o acontece no �nicio
		// Inser��o no fim da Fila
		FILA inicio = null;
		FILA fim = null;
		// ponteiro auxiliar
		FILA aux;
		//Criando Menu de op��es
		int op;
		do {
			System.out.println("--------------- Menu Fila ------------------");
			System.out.println("1 - Inserir n� na Fila");
			System.out.println("2 - Consultar toda a Fila");
			System.out.println("3 - Remover da Fila");
			System.out.println("4 - Esvaziar Toda a Fila");
			System.out.println("5 - Fechar Aplica��o");
			System.out.println("--------------------------------------------");
			System.out.println("Digite a Op��o desejada: ");
			
			op = entrada.nextInt();
			if(op < 1 || op > 5)
				System.out.println("Op��o Inv�lida!");
			if(op == 1) {
				System.out.println("Digite o N� a ser inserido na Fila: ");
				FILA novo = new FILA();
				novo.num = entrada.nextInt();
				novo.prox = null;
				if(inicio == null) {
					// fila vazia o primeiro n� � o primeiro e o ultimo
					inicio = novo;
					fim = novo;
				}else {
					// ja tem elementos na fila ent�o o n� vai pro final
					fim.prox = novo;
					fim = novo;
				}
				System.out.println("N�mero Inserido na Fila com Sucesso!");
			}
			if(op == 2) {
				if(inicio == null) {
					System.out.println("Fila Vazia!");
				}else {
					// imprimindo elementos do primeiro inserido ao ultimo
					System.out.println("Consultando a Fila...");
					aux = inicio;
					while (aux != null) {
						System.out.println(aux.num+" ");
						aux = aux.prox;
					}
				}
			}
			if(op == 3) {
				if(inicio == null) {
					System.out.println("Fila Vazia!");
				}else {
					// a fila tem elementos e o primeiro vai ser removido
					System.out.println("O N�mero "+inicio.num+" foi removido!");
					inicio = inicio.prox;
				}
			}
			if(op == 4) {
				if(inicio == null) {
					System.out.println("Fila Vazia!");
				}else {
					// a fila ser� esvaziada
					inicio = null;
					System.out.println("Fila Esvaziada com Sucesso!");
				}
			}
		}while (op != 5);		
	 }
   }

