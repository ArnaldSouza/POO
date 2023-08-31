    
package javaapplication1;


public class Nascimento implements IDocumentacao{
   private String cidadeNatal;
   private String estado;
   private int valor;
   
   public void City(String cidadeNatal){
     this.cidadeNatal = cidadeNatal;  
   }
   
   public void City(String cidadeNatal, String estado, int valor){
       this.cidadeNatal = cidadeNatal;
       this.estado = estado;
       documento(valor);
   }
   
   public String getEstado(){
        return this.estado;
   }
 
   public void setEstado(String estado){
        this.estado = estado;
   }
   
   
   
}

