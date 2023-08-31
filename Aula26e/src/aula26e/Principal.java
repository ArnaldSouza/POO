
package aula26e;

/**
 * TODO1: Classe Principal: implemente a interface 'IMaterialEscolar'
 *         com os metodo abstratos 'setPreco(float)' e 'setFornecedor(String)'.
 * 
 * TODO2: Classe MaterialEscolar: adicione um construtor sobrecarregado
 *         que receba o nome, o preco, e o fornecedor.
 * 
 * TODO3: Classe MaterialEscolar: implemente a interface 'IMaterialEscolar'. 
 * 
 * TODO4: Classe Principal: No metodo iniciar, imprima o nome, o preco e o
 *          fornecedor de cada item da lista, a partir do ultimo item.
 */


import java.util.ArrayList;

public class Principal {
    
    public interface IMaterialEscolar{
        public void setPreco(float preco);
        public void setFornecedor(String fornecedor);
    }
    
    public class MaterialEscolar implements IMaterialEscolar{
    
        private String nome;
        private float preco;
        private String fornecedor;

        public MaterialEscolar(String nome){
            this.nome=nome;
        }

        public MaterialEscolar(String nome, float preco, String fornecedor){
            this.nome=nome;
            this.preco = preco;
            this.fornecedor = fornecedor;
        }

        public void setPreco(float preco){
            this.preco = preco;
        }

        public void setFornecedor(String fornecedor){
            this.fornecedor = fornecedor;
        }

        public String toString(){
            return this.nome + " " + this.preco + " " + this.fornecedor;
        }
    
    }
    ArrayList<MaterialEscolar> lista;
    
    public interface Iterator {
        public boolean temAnterior();
        public Object anterior();
    }

public class ItemIterator implements Iterator {

	private ArrayList< MaterialEscolar > lista;
	private int pos=0;
	
	public ItemIterator(ArrayList<MaterialEscolar> lista){
		this.lista = lista;
		
		pos=this.lista.size()-1;
	}
	
	public boolean temAnterior() {
		boolean result=false;
		if ( pos >= 0 )
			result=true;
		return result;
	}
	public Object anterior() {
		MaterialEscolar item  = this.lista.get(pos);
		pos--;
		return item;
	}	
	
	public boolean temProximo() {
		boolean result=false;
		if ( pos < this.lista.size() )
			result=true;
		return result;
	}
	
	public Object proximo() {
		MaterialEscolar item  = this.lista.get(pos);
		pos++;
		return item;
	}	
}
    
    public void iniciar(){
        lista = new ArrayList<>();
        lista.add(new MaterialEscolar("Lapis",0.5f,"BIC"));
        lista.add(new MaterialEscolar("Borracha",0.15f,"Faber-Castell"));
        
        Iterator i = new ItemIterator( lista );
        while( i.temAnterior() )
           System.out.println( (MaterialEscolar) i.anterior() );
        
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
}

