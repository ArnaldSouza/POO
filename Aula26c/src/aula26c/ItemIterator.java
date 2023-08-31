
package aula26c;


import java.util.ArrayList;

public class ItemIterator implements Iterator {

	private ArrayList< MaterialEscolar > lista;
	private int pos=0;
	
	public ItemIterator(ArrayList<MaterialEscolar> lista){
		this.lista = lista;
		
		//TODO2]
                this.pos = this.lista.size() - 1;
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
		Object item  = this.lista.get(pos);
		pos++;
		return item;
	}	
}
