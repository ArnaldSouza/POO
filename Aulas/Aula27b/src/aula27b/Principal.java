
package aula27b;


/**
 * TODO1: Classe Estoque: implemente a classe para que ela seja um Singleton.
 *
 * TODO2: Classe Principal: faca a tentativa de instanciar 2 (dois) objetos da 
 *         classe Estoque.
 * 
 * TODO3: Estoque: Modifique a classe Estoque para que ela adicione a lista de
 *         MaterialEscolar.
 * 
 * TODO4: Classe Principal: exiba todos os itens da lista do Estoque.
 */

import java.util.ArrayList;

public class Principal {
    
    public class MaterialEscolar {
    private String nome;
    public MaterialEscolar(String nome){
        this.nome=nome;
    }
    public String toString(){
        return this.nome;
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
		
		//pos=this.lista.size()-1;
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
        lista.add(new MaterialEscolar("Lapis"));
        lista.add(new MaterialEscolar("Borracha"));
        
        
        
        //TODO2
        Estoque estoque = Estoque.iniciar( lista );

        Estoque estoque2 = Estoque.iniciar( lista );
        
        //TODO4
        ItemIterator i = new ItemIterator( estoque.getLista() );
        while( i.temProximo() )
           System.out.println( (MaterialEscolar) i.proximo() );
        
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
}
