
package aula27e;


public class Principal {
    
    public class Vendedor implements java.util.Observer {		
		
        private String nome;
        public Vendedor(String nome){
                this.nome=nome;
        }

        @Override
        public void update(java.util.Observable remoto, Object atributoRemoto) {
                System.out.println(this +": Recebi atualizacao de [" + remoto + "]" + 
                                 " que mudou o seguinte atributo: " + atributoRemoto);					
        }
        public String toString(){
                return this.nome;
        }
				
    }
    
    public class FrutaVendas extends java.util.Observable {
        private String nome;
        private int estoque;
        public FrutaVendas(String nome, int estoque){
                this.nome=nome;
                this.estoque=estoque;
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
    }//fim classe


    
    public void iniciar(){
        FrutaVendas fruta = new FrutaVendas("Abacate",108); //nome,estoque
		
		Vendedor arnald = new Vendedor("ARNALD");
		Vendedor maria = new Vendedor("MARIA");
		
		fruta.addObserver(arnald);
		fruta.addObserver(maria);
		
		fruta.venda(10);
                fruta.venda(18);
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
