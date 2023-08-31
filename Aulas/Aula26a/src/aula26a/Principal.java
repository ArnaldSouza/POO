
package aula26a;

import java.util.ArrayList;

public class Principal {
    
    private ArrayList<Fruta> lista;
    
    public interface Iterator{
        public abstract boolean temProximo();
        public abstract Object proximo();
    }
    
    public class Fruta{
        private String nome;
        
        public Fruta(String nome){
            this.nome = nome;
        }
        
        public String toString(){
            return this.nome;
        }            
        
    }
    
    public class ItemIterator implements Iterator{
        private ArrayList<Fruta> lista;
        private int pos = 0;
        
        public ItemIterator(ArrayList<Fruta> lista){
            this.lista = lista;
        }
        
        public boolean temProximo(){
            boolean result = true;
            
            if(this.pos > this.lista.size()-1)
                result = false;
                
            return result;            
        }
        
        public Object proximo(){
            
            Object item = this.lista.get(this.pos);
            this.pos++;
            
            return item;            
        } 
    }
    
    
    public void iniciar(){
        lista = new ArrayList<>();
        lista.add(new Fruta("Banana"));
        lista.add(new Fruta("Morango"));
        lista.add(new Fruta("Laranja"));
        
        Iterator i = new ItemIterator(lista);
        while(i.temProximo()){
            System.out.println((Fruta) i.proximo());
        
        }
    }
    
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
