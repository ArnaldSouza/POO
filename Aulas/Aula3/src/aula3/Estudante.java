package aula3;

public class Estudante {
    
    //Atributos
    private String nome;
    private String endereco;  
    private String RA; 
    private int qtdAulas;
    
    
     public Estudante(String nome, String endereco, String RA){
        setNome(nome);
        setEndereco(endereco);
        setRA(RA);
        this.qtdAulas = 1;
    }
    
    public String toString(){
        return getNome() + "\t" + getEndereco() + "\t" + getRA() + this.qtdAulas;
    } 
     
    public String getRA() {return this.RA; }

    public void setRA(String RA) {this.RA = RA;}
          
    public String getEndereco() {return this.endereco;}
    
    public void setEndereco(String endereco) {this.endereco = endereco;}
    
    public String getNome() {return this.nome;}
    
    public void setNome(String nome) {this.nome = nome;}

    public int getQtdAulas() {return qtdAulas;}

    public void setQtdAulas(int qtdAulas) {this.qtdAulas = qtdAulas;}
    
    
    
}
