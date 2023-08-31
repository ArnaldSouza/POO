
package avaliação1;

public class Departamento_A extends SistemaGestaoAcademica{
    protected Coordenador coordenador;
    
    public Coordenador c1;
    public Coordenador c2;

    public Departamento_A(Coordenador coordenador, String nomeGestor, String nomeDisciplina, int qtdAlunos) {
        super(nomeGestor, nomeDisciplina, qtdAlunos);
        this.coordenador = coordenador;
    }    
    

    public Departamento_A(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    
}
