
package aula8b;


public class Conta {
      private int numero;
      private float saldo;

      public Conta( int numero, float saldo ){
             this.numero = numero;
             this.saldo = saldo;
      }

      public void saque(float valor){
               this.saldo -= valor;
      }
      
      public void deposito(float valor){
        this.saldo += valor;
      }
      public float getValor(){
              return this.saldo;
         }
}//fim classe

