
package aula16b;

/**
 * TODO 1: Modifique a classe MembroUniversitario para que ela se torne uma interface.
 *         Faca as modificacoes necessarias nas demais classes.
 * TODO 2: Defina um objeto do tipo MembroUniversitario que seja instanciado com
 *          um tipo Bolsista.
 * TODO 3: Imprima o salario do objeto do item anterior com o metodo 'toString()'.
 * TODO 4: Atribua um tipo Estudante para o mesmo objeto do item anterior.
 * TODO 5: Imprima o salario do objeto do item anterior com o metodo 'toString()'.
 */
public class Principal {

    //TODO 1
    public interface MembroUniversitario {
        public abstract float getSalario();
        public String toString();
    }

    public class Bolsista implements MembroUniversitario {
        protected float salario;
        public Bolsista(float salario){
            this.salario = salario;
        }
        public float getSalario(){
            return this.salario;
        }
        public String toString(){
            return this.getClass().getSimpleName() + " - Salario: " + this.salario;
        }
    }
    public class Estudante implements MembroUniversitario {
        protected float salario;
        public Estudante(){
            this.salario = 3105.0f;
        }
        public float getSalario(){
            return this.salario;
        }
        public String toString(){
            return this.getClass().getSimpleName() + " - Salario: " + this.salario;
        }
    }


    public void iniciar(){
        
        //TODO 2
        MembroUniversitario b = new Bolsista(15000);
        
        //TODO 3
        System.out.println(b);
        
        //TODO 4
        b = new Estudante();
        
        //TODO 5
        System.out.println(b);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}