
package aula8b;


public class Estudante extends Cliente {
         private String nome;
         private String endereco;
         
         public Estudante( String nome, String endereco ){
                   this.nome = nome;
                   this.endereco = endereco;
         }
         
         public Estudante( String nome, String endereco, Conta conta ){
                   super( conta );
                   this.nome = nome;
                   this.endereco = endereco;
         }
}


