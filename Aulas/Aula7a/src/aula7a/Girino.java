
package aula7a;

//Subclasse
public class Girino extends Sapo {  
        
    public Girino(String nome, String cor){
        
        super(nome,cor);
        setCor(cor); //--> Herança
        setNome(nome);
        
        
    }
}
