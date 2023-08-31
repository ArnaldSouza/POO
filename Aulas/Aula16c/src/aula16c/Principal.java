
package aula16c;


/**
 * TODO 1: No metodo iniciar, crie uma lista dinamica de objetos
 *          do tipo MembroUniversitario.
 * TODO 2: Defina um objeto do tipo MembroUniversitario que seja instanciado com
 *          um tipo Bolsista.
 * TODO 3: Adicione ah lista o objeto do item anterior.
 * TODO 4: Atribua um tipo Estudante para o mesmo objeto do TODO 2.
 * TODO 5: Adicione ah lista o objeto do item anterior.
 * TODO 6: Imprima o salario de cada objeto da lista com o metodo polimorfico 'toString()'
 */
import java.util.List;
import java.util.ArrayList;

public class Principal {

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

    public void iniciar(){
        
        //TODO 1
        List<MembroUniversitario> lista = new ArrayList<MembroUniversitario>();

        
        //TODO 2
        MembroUniversitario b = new Bolsista(1822.0f);
        
        //TODO 3
        lista.add(b);
        
        //TODO 4
        b = new Estudante();
        
        //TODO 5
        lista.add(b);
        
        //TODO 6
        for(MembroUniversitario p : lista)
            System.out.println(p);

        
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}