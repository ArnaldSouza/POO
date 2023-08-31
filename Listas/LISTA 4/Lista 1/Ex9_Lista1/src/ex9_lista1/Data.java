package ex9_lista1;

public class Data {

	 private int dia;
	 private int mes;
	 private int ano;
	
	public Data data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		return this;
	}

}