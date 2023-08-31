package avaliacao1;


public class SistemaGestaoAcademica {
  
    private String nomeGestor;
    private String nomeDisciplina;
    private int qtdAlunos;
    
    public SistemaGestaoAcademica(){
        setNomeGestor("");
        setNomeDisciplina("");
        setQtdAlunos(0);
    }
    
    public SistemaGestaoAcademica(String nomeGestor, String nomeDisciplina, int qtdAlunos){
        setNomeGestor(nomeGestor);
        setNomeDisciplina(nomeDisciplina);
        setQtdAlunos(qtdAlunos);
    }
    
    public void setNomeGestor(String nomeGestor){
        this.nomeGestor = nomeGestor;
    }
    public String getNomeGestor(){
        return this.nomeGestor;
    }
   
    public void setNomeDisciplina(String nomeDisciplina){
           this.nomeDisciplina = nomeDisciplina;
    }
    public String getNomeDisciplina(){
              return this.nomeDisciplina;
    }
    
    public void setQtdAlunos(int QtdAlunos){
           this.qtdAlunos = qtdAlunos;
    }
    public int getQtdAlunos(){
              return this.qtdAlunos;
    }

    
    public String toString(){
        return this.getClass().getCanonicalName() +
                 "\n Gestor: " + this.getNomeGestor() +
                 "\n Disciplina:" + this.getNomeDisciplina() + 
                 "\n Quantidade de alunos: " + this.getQtdAlunos();
    }

}
