package PilhaEstatica;

public class App {

	public static void main(String[] args) {
		
		
		int numero = Integer.parseInt(args[0]);
		
		
		Pilha p = new Pilha();
		int resto;
		
		// fase 1 = empilhamento de restos
		while (numero != 0) {
			resto = numero % 2 ; // pego o resto da divis�o por 2 (� 0 ou 1)
			p.push(resto);       // armazeno na pilha
			numero = numero / 2 ;// gero um novo n�mero, resultado da divis�o dele por 2
		}
		
		// fase 2 = exibi��o de restos
		while (!p.isEmpty()) {
			resto = p.pop();	// remove da pilha o que est� no topo
			System.out.println(resto);
			
		}
		System.out.println("Fim do Programa de Pilha!");

	}

}
