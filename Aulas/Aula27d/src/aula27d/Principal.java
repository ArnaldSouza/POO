
package aula27d;

/**
 * TODO1: Implemente uma interface 'IFiltro' com um 
 *         metodo abstrato 'imprimir' sem parametros.
 * 
 * TODO2: Substitua o comentario 'TODO2' para que as classes 
 *         'FiltroPreco' e 'FiltroFornecedor' implementem a interface 'IFiltro'
 *
 * TODO3: Instancie um objeto do tipo da interface 'IMaterialEscolar'.
 * 
 * TODO4: Instancie um objeto do tipo da interface 'IFiltro'. Este objeto deve
 *         ser sobrescrito com uma instancia da classe 'FiltroPreco'.
 * 
 * TODO5: Invoque o metodo 'imprimir' do objeto do tipo da interface 'IFiltro'
 *         do item anterior.
 * 
 * TODO6: Instancie um objeto do tipo da interface 'IFiltro'. Este objeto deve
 *         ser sobrescrito com uma instancia da classe 'FiltroFornecedor'.
 * 
 * TODO7: Invoque o metodo 'imprimir' do objeto do tipo da interface 'IFiltro'
 *         do item anterior.
 * 
 */


public class Principal {

    //TODO1
    public interface IFiltro {
        public abstract void imprimir();
    }

    public class FiltroPreco implements IFiltro {
        private IMaterialEscolar me;
        private float preco;
        public FiltroPreco(IMaterialEscolar me){
            this.me = me;
            this.preco = me.getPreco();
        }
        public void imprimir(){
            System.out.println("Produto: " + me.getNome() + " Preco: " + preco);
        }
    }
    
    
    public class FiltroFornecedor implements IFiltro {
        private IMaterialEscolar me;
        private String fornecedor;
        public FiltroFornecedor(IMaterialEscolar me){
            this.me = me;
            this.fornecedor = me.getFornecedor();
        }
        public void imprimir(){
            System.out.println("Produto: " + me.getNome() + " Fornecedor: " + fornecedor);
        }
    }
    
    public interface IMaterialEscolar {
        public abstract String getNome();
        public abstract float getPreco();
        public abstract String getFornecedor();
    }
    public class MaterialEscolar implements IMaterialEscolar{
        private String nome;
        private float preco;
        private String fornecedor;
        public MaterialEscolar(String nome, float preco, String fornecedor){
            this.nome = nome;
            this.preco=preco;
            this.fornecedor=fornecedor;
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
    }
    
    public void iniciar(){
        
        //TODO3
        IMaterialEscolar me = new MaterialEscolar("Arnald", 2.0f,"Maria");
        
        //TODO4
        IFiltro filtro = new FiltroPreco(me);
                
        //TODO5
        filtro.imprimir();
        
        //TODO6
        filtro = new FiltroFornecedor(me);
        
        //TODO7
        filtro.imprimir();
    }

    public static void main(String[] args) {
        new Principal().iniciar();
    }
}