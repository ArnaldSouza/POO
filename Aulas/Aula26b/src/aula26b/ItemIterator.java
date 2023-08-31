
package aula26b;


import java.util.ArrayList;
public class ItemIterator implements Iterator{

	private ArrayList<MaterialEscolar> lista;
	private int pos=0;
	
	public ItemIterator(ArrayList<MaterialEscolar> lista){
		this.lista = lista;
	}
	
	public boolean temProximo() {
		boolean result=false;
		if ( pos < this.lista.size()-1)
			result=true;
		return result;
	}
	
	public Object proximo() {
		Object item  = this.lista.get(pos);
		pos++;
		return item;
	}	
}