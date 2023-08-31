
package aula16d;

/**
 * TODO 1: Classe Principal: crie um metodo publico
 *          'void adicionar(MembroUniversitario membro)'.
 * TODO 2: Classe Principal: crie uma variavel de instancia 'lista'
 *          que seja uma lista dinamica do tipo MembroUniversitario.
 * TODO 3: Classe Principal: inicialize a lista dinamica do item anterior
 *          no construtor padrao sem argumentos.
 * TODO 4: No metodo iniciar, defina um objeto do tipo MembroUniversitario que 
 *          seja instanciado com um tipo Bolsista.
 * TODO 5: Adicione o objeto ah lista, com o metodo do TODO 1.
 * TODO 6: Atribua um tipo Estudante para o mesmo objeto do TODO 4.
 * TODO 7: Adicione o objeto ah lista, com o metodo do TODO 1.
 * TODO 8: No metodo iniciar, invoque o metodo 'imprimir'.
 */
import java.util.List;
import java.util.ArrayList;
public class Principal {

    //TODO 2
    List<MembroUniversitario> lista;
    //TODO 3
    public Principal(){
        lista = new ArrayList<MembroUniversitario>();
    }
        
    
    public interface MembroUniversitario {        
        public abstract float getSalario();        
        public abstract String toString();            
    }

    public class Bolsista implements MembroUniversitario {
    	private float salario;
        public Bolsista(float salario){
            this.salario=salario;
        }
        public float getSalario(){
            return this.salario;
        }
        public String toString(){
        	return this.getClass().getSimpleName() + "\tSalario: R$" + getSalario();
        }
    }
    public class Estudante implements MembroUniversitario {
    	private float salario;
        public Estudante(){
        	this.salario=0.0f;
        }
        public float getSalario(){
            return this.salario;
        }
        public String toString(){
        	return this.getClass().getSimpleName() + "\tSalario: R$" + getSalario();
        }
    }

    //TODO 1
    public void adicionar(MembroUniversitario membro){
        lista.add(membro);
    }
    
    
    public void imprimir(){
        for(MembroUniversitario membro : lista)
           System.out.println( membro );
    }

    public void iniciar(){
        
        //TODO 4
        MembroUniversitario b = new Bolsista(1202.8f);
        
        //TODO 5
        adicionar(b);
        
        //TODO 6
        b = new Estudante();
        
        //TODO 7
        adicionar(b);
                       
        //TODO 8
        imprimir();
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}
