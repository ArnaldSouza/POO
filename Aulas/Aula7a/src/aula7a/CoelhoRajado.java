
package aula7a;

//Subclasse
public class CoelhoRajado extends Coelho {  
        
    public CoelhoRajado(String nome, String cor, String pelos, int pernas){
        
        super(nome,cor,pelos, pernas);
              
        
    }
    
    //Sobrescrita
    public String toString(){
        return this.getNome() + "\n" + this.getCor() + "\n" + this.pelos + "\n" + this.pernas;
    }
}
