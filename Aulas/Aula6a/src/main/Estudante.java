
package main;

public class Estudante {
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
    
    public int imprimir(int idade){ return this.idade;}
    
    public String imprimir(String nome, int idade){return this.nome + "\n" + this.idade;}
    
    public String imprimir(String noome, int idade, String CPF){return this.nome + "\n" + this.idade + "\n" + this.CPF;}
    
}