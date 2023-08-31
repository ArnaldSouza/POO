
package aula27f;

/**
 * TODO1: Vendedor: Substitua o trecho comentado 'TODO1' para que a classe implemente
 *         a "interface" 'java.util.Observer'
 * 
 * TODO2: MaterialEscolar: Substitua o trecho comentado 'TODO2' para que a classe 
 *         seja "subclasse" da classe 'java.util.Observable'
 * 
 * TODO3: Principal: No metodo iniciar, adicione um observador ao objeto observavel:
 *         "me.addObserver(joao);"
 * 
 * TODO4: Principal: No metodo iniciar, adicione um observador ao objeto observavel:
 *         "me.addObserver(maria);"
 * 
 * TODO5: Principal: No metodo iniciar, invoque o metodo observavel:
 *            "me.venda(10);"
 */

import java.util.Observer;
import java.util.Observable;
public class Principal {

    public class Vendedor implements java.util.Observer {		
		
		private String nome;
		public Vendedor(String nome){
			this.nome=nome;
		}
		
		@Override
		public void update(Observable remoto, Object atributoRemoto) {
			System.out.println(this +": Recebi atualizacao de [" + remoto + "]" + 
					 " que mudou o seguinte atributo: " + atributoRemoto);					
		}
		public String toString(){
			return this.nome;
		}
	}


    public interface IMaterialEscolar {
        public abstract String getNome();
        public abstract float getPreco();
        public abstract String getFornecedor();
        public abstract int getEstoque();
    }
    
    public class MaterialEscolar extends java.util.Observable implements IMaterialEscolar{
        private String nome;
        private float preco;
        private String fornecedor;
        private int estoque;
        public MaterialEscolar(String nome, float preco, String fornecedor, int estoque){
            this.nome = nome;
            this.preco=preco;
            this.fornecedor=fornecedor;
            this.estoque=estoque;
        }
        public String getNome(){
            return this.nome;
        }
        public float getPreco(){
            return this.preco;
        }
        public String getFornecedor(){
            return this.fornecedor;
        }
        public int getEstoque(){
            return this.estoque;
        }
        public void venda(int qtde){
			if(estoque>0){
				estoque -= qtde;
				this.setChanged(); //Mudou o estado do objeto
				this.notifyObservers("estoque: " + this.estoque); //Notifique todos os Observers
			}				
		}//fim venda
		public String toString(){
			return this.getClass().getSimpleName();
		}

    }
    
    public void iniciar(){
        
        //Objeto Observador
        Vendedor arnald = new Vendedor("ARNALD");
	Vendedor maria = new Vendedor("MARIA");

        //Objeto Observavel
        MaterialEscolar me = new MaterialEscolar("Lapis",1.5f,"JOAO",1000);
        
        //TODO3
        me.addObserver(arnald);
        
        //TODO4
        me.addObserver(maria);
        
        //TODO5
        me.venda(10);
        
    }

    public static void main(String[] args) {
        new Principal().iniciar();
    }
}
