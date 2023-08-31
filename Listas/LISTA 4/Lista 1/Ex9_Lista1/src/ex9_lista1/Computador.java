package ex9_lista1;

public class Computador {

	private Data data;
	private String nome;
	private String marca;
	
	
	public Computador setNome(String nome) {
		this.nome = nome;
		return this;
		
	}
	
	public Computador setMarca(String marca) {
		this.marca = marca;
		return this;
	}

	public void setData(int dia, int mes, int ano) {
		Data d = new Data();
		this.data = d.data(dia, mes, ano);
	}
}