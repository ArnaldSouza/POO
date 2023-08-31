
package javaapplication1;

public class TempoVida implements IDocumentacao{
   private int idade;
   private String mesNascimento;
   private int valor;
   
   public void Age(int idade){
       this.idade = idade;
   }
   
   public void Age(int idade, String mesNascimento, int valor){
       this.idade = idade;
       this.mesNascimento = mesNascimento;
       documento(valor);
   }
   
   public String getMes(){
        return this.mesNascimento;
   }
 
   public void setMes(String mesNascimento){
        this.mesNascimento = mesNascimento;
   }
   
   
}

