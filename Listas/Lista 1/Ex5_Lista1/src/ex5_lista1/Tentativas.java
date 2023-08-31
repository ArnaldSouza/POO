/*
 * Classe referente ao exercicio 6
  Essa classe tem como proposito registrar a quantidade de tentativas de usuário ao
  tentar acertar o número aleátorio, quantas delas foram maiores e menores que o número, e por fim
  informa-las ao usuário
 */
package ex5_lista1;

public class Tentativas {

	int total_tentativas = 0;
	int maior = 0;
	int menor = 0;
	
	public void quant_tentativas() {
		this.total_tentativas++;
	}

	public void maior() {
		this.maior++;
	}
	
	public void menor() {
		this.menor++;
	}
	public void getTentativas(Tentativas t) {
		System.out.println("Houveram "+t.total_tentativas +" tentativas");
		System.out.println(+t.maior +" tentativas foram números maiores que o número correto.");
		System.out.println(+t.menor +" tentativas foram números menores que o número correto.");
	}
}