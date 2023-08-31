
package avaliação1;

public class Coordenador extends Empregado{
    private int ID;
    private String curso;

    public Coordenador(int ID, String curso, float salario) {
        super(salario);
        this.ID = ID;
        this.curso = curso;
    }

        
       
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
