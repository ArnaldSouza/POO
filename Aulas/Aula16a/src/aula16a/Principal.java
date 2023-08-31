
package aula16a;

/**
 * TODO 1: No metodo iniciar, defina um objeto do tipo MembroUniversitario que seja instanciado
 *          com um tipo Bolsista.
 * TODO 2: Imprima o salario do objeto do item anterior com o metodo 'toString()'.
 * TODO 3: Atribua um tipo Estudante para o mesmo objeto do item anterior.
 * TODO 4: Imprima o salario do objeto do item anterior com o metodo 'toString()'.
 */
public class Principal {

    public abstract class MembroUniversitario {
        protected float salario;
        public abstract float getSalario();
        public MembroUniversitario(float salario){
            this.salario=salario;
        }
        public String toString(){
            return this.getClass().getSimpleName() + " - Salario: " + this.salario;
        }
    }

    public class Bolsista extends MembroUniversitario {
        public Bolsista(float salario){
            super(salario);
        }
        public float getSalario(){
            return this.salario;
        }
    }
    public class Estudante extends MembroUniversitario {
        public Estudante(){
            super(0.0f);
        }
        public float getSalario(){
            return this.salario;
        }
    }

    public void iniciar(){
        
        //TODO 1
        MembroUniversitario b = new Bolsista(150.0f);
                
        //TODO 2
        System.out.println(b);
        
        //TODO 3
        b = new Estudante();
        
        //TODO 4
        System.out.println(b);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}
