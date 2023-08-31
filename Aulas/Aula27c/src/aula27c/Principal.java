
package aula27c;

public class Principal {

    public interface IFiltro {
        public abstract void imprimir(Fruta fruta);
    }
    
    public class FiltroPreco implements IFiltro {
        public void imprimir(Fruta fruta){
            System.out.println(fruta.getPreco());
        }
    }
    public class FiltroNome implements IFiltro {
        public void imprimir(Fruta fruta){
            System.out.println(fruta.getNome());
        }
    }
    
    public interface Fruta {  
        public float getPreco();
        public String getNome();
    }
    
    public class Abacate implements Fruta {
        private String nome;
        private float preco;
        public Abacate(String nome, float preco){
            this.nome=nome;
            this.preco=preco;
        }
        public float getPreco(){ return this.preco; }
        public String getNome(){ return this.nome; }
    }
    
    public void iniciar(){
        Fruta fruta = new Abacate("ABACATE", 0.75f);    
        IFiltro filtro = new FiltroPreco();
        
        filtro.imprimir( fruta );
        
        filtro = new FiltroNome();
        
        filtro.imprimir( fruta );
        
        
    }
    
    
    public static void main(String[] args) {
        Principal principal =  new Principal();
        principal.iniciar();
    }
    
}
