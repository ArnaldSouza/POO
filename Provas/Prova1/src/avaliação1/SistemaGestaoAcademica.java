package avaliação1;

public class SistemaGestaoAcademica {
    private String nomeGestor;
    private String nomeDisciplina;
    private int qtdAlunos;

    public SistemaGestaoAcademica(String nomeGestor, String nomeDisciplina, int qtdAlunos) {
        this.nomeGestor = nomeGestor;
        this.nomeDisciplina = nomeDisciplina;
        this.qtdAlunos = qtdAlunos;
    }   
    
    
    public String getNomeGestor() {
        return nomeGestor;
    }

    public void setNomeGestor(String nomeGestor) {
        this.nomeGestor = nomeGestor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    
    
}
