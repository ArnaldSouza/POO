
package aula16e;

/**
 * TODO 1: Classe Principal: crie uma nova classe interna 'Tecnico' que
 *          implemente a interface 'MembroUniversitario'
 * TODO 2: Metodo iniciar: Atribua ao objeto 'arnald' o tipo 'Tecnico' com polimorfismo.
 * TODO 3: Metodo iniciar: Invoque o metodo 'imprimir'
 */
import java.util.List;
import java.util.ArrayList;
public class Principal {

    private List<MembroUniversitario> lista;

    public Principal(){
        lista = new ArrayList<>();
    }

    public interface MembroUniversitario {        
        public abstract float getSalario();        
        public abstract String toString();            
    }
    
    //TODO 1
    public class Tecnico implements MembroUniversitario{
      private float salario;
        public Tecnico(float salario){
            this.salario=salario;
        }
        public float getSalario(){
            return this.salario;
        }
        public String toString(){
        	return this.getClass().getSimpleName() + "\t\tSalario: R$" + getSalario();
        }  
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

    public void adicionar(MembroUniversitario membro){
        lista.add( membro );
    }

    public void imprimir(){
        for(MembroUniversitario membro : lista)
           System.out.println( membro );
    }

    public void iniciar(){
        
        //
        lista = new ArrayList<>();
        
        //
        MembroUniversitario arnald = new Bolsista(400.0f);
        
        //
        adicionar( arnald );
        
        //
        arnald = new Estudante();
        
        //
        adicionar( arnald );
        
        //TODO 2
        arnald = new Tecnico(1500);
        adicionar(arnald);
        
        //TODO 3
        imprimir();
        
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}