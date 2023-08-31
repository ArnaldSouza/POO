
package aula8b;

//Subclasse
public class Cliente {
       private Conta conta;     //Composicao

       public Cliente(  Conta conta ){
              this.conta = conta;             
       }
       public Conta getConta(){
              return this.conta;
       }

}//fim classe

