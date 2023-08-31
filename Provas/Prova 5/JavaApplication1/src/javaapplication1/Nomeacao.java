
package javaapplication1;

public class Nomeacao implements IDocumentacao{
   private String nome;
   private String sobrenome;
   private int valor;
      
   
   public void Nome(String nome){
       this.nome = nome; 
   }
   
   public void Nome(String nome, String sobrenome, int valor){
       this.nome = nome; 
       this.sobrenome = sobrenome;
       documento(valor);
   }
   
   public String getSobrenome(){
        return this.sobrenome;
   }
 
   public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
   }
   
   
}
