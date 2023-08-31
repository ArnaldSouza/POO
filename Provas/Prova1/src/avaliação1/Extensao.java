
package avaliação1;

public class Extensao extends SistemaGestaoAcademica{
    protected Monitor monitor;

    public Monitor m1;
    public Monitor m2;
    public Monitor m3;

    
    public Extensao(Monitor monitor, String nomeGestor, String nomeDisciplina, int qtdAlunos) {
        super(nomeGestor, nomeDisciplina, qtdAlunos);
        this.monitor = monitor;
    }
    
    

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Extensao(Monitor monitor) {
        this.monitor = monitor;
    }
     
     
}
