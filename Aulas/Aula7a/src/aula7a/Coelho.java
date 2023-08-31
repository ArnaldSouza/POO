
package aula7a;

//Subclasse
public class Coelho extends Animal {  
    
    protected String pelos;
    
    public Coelho(String nome, String cor, String pelos, int pernas){
        
        super(nome, cor,pernas);
        this.pelos = pelos;
        //setCor(cor); --> Herança
        //setNome(nome);       
                
    }
}

