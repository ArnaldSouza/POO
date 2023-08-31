/*
  classe relativa ao ex 4.
 O objetivo dessa classe é registrar e armazenar a data em que o veiculo entrou e
  saiu do estacionamento
 */
package ex3_lista1;

public class Data {

private int d;
private int m;
private int a;

	public Data data(int d, int m, int a) {
		this.d = d;
		this.m = m;
		this.a = a;
		return this;
	}

}