
package aula14a;

/*
 * TODO 1: Classe Principal: Defina um objeto do tipo MembroUniversitario. 
 *          Instancie esse objeto com um tipo Estudante.
 * TODO 2: Classe Principal: Utilize o objeto instanciado para 
 *          invocar o metodo 'getHistorico()'. 
 * TODO 3: Classe Principal: Defina um objeto do tipo Egresso. 
 *          Instancie esse objeto com um tipo Estudante.
 * TODO 4: Classe Principal: Utilize o objeto instanciado para 
 *          invocar o metodo 'getDiploma()'. 
 */

public class Principal {

    public abstract class MembroUniversitario {
        protected String nome;
        protected float nota;
        public abstract void getHistorico();
        MembroUniversitario(String nome, float nota){
            this.nome = nome;
            this.nota = nota;
        }
    }
    public interface Egresso {
        public abstract void getDiploma();
    }
    public class Estudante extends MembroUniversitario implements Egresso {
        public Estudante(String nome, float nota){
            super(nome,nota);
        }
        public void getHistorico(){
            System.out.println("Historico: " + nome + " Nota: "+nota);
        }
        public void getDiploma(){
            System.out.println("Diploma: " + nome + " Nota: "+nota);
        }
    }

    public void iniciar(){
        //TODO1
        MembroUniversitario membroUniversitario = new Estudante("Arnald", 9.5f);
        //TODO2
        membroUniversitario.getHistorico();
        //TODO3
        Egresso egresso = new Estudante("Arthur", 8.5f);
        //TODO4
        egresso.getDiploma();
    }
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}
