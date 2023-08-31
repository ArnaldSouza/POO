
package aula7a;

//Superclasse
public class Animal {

    private String nome;
    private String cor;
    protected int pernas;
    
    public Animal(String nome, String cor,int pernas){
        setCor(cor);
        setNome(nome);
        this.pernas = pernas;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
