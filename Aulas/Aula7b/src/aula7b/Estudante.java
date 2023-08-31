
package aula7b;

public class Estudante 
    extends MembroUniversitario{
    private String nome;
    private int idade;
    private String CPF;
    
    public Estudante(String nome){
        this.nome=nome;
        this.idade=0;
        this.CPF="";
    }
    public Estudante(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
        this.CPF="";
    }
    public Estudante(String nome, int idade, String CPF){
        this.nome=nome;
        this.idade=idade;
        this.CPF=CPF;
    }
    
    public String toString(){
        return this.nome + "\n" + this.idade + "\n" + this.CPF;
    }
}

