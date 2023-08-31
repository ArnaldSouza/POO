
package aula8a;

//Superclasse
public class Estudante {
    private String nome;
    private String endereco;
    private int matricula;
    private float salario;
    
   public Estudante(){ 
       
   }
   
   public Estudante(String nome) {
        this.nome = nome;
   }
   
   public Estudante (String nome, float salario){
        this.nome = nome;
        this.salario = salario;
   }

   public float getSalario(){
       return  this.salario; 
   }
   
   public void setSalario(float salario){
        this.salario = salario;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
}//fim classe

