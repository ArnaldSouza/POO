
package aula5b;

public class Estudante {
    private String nome;
    public int idade;
    private String endereco;
    
    public Estudante(){
        this.nome="";
    }
    public Estudante(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNome(){
        this.nome="ESTUDANTE";
    }
    public String toString(){
        return this.nome + " " + this.idade;
    }
    
    
}