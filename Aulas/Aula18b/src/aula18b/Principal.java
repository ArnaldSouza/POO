/**
 * TODO 1: Implemente o metodo 'void leitura(int numerador, int denominador)' 
 * TODO 2: No metodo leitura: dispare a excecao 'ArithmeticException' 
 *          caso o denominador seja igual a zero.
 * TODO 3: Implemente a captura da excecao na chamada do metodo 'leitura'
 * TODO 4: Mostre uma mensagem personalizada quando a excecao for capturada.
 */

package aula18b;

public class Principal {
   //TODO1
   public void leitura(int numerador, int denominador){
       
       float resultado;
       
       if(denominador == 0)
         throw new ArithmeticException(); //ordem
       else
          resultado = numerador/denominador;              
       
   }

   //TODO 2

   public void iniciar(){
          int numerador=0;
          int denominador=0;
          float resultado=0;
          
          try {
             //TODO3    
             leitura( numerador, denominador); 
          } catch( ArithmeticException ex  ){
          //TODO 4
             System.out.println("Excecao: " + ex.getMessage());
          }
   }
   public static void main(String [] args){
       Principal principal = new Principal();
       principal.iniciar();
   }

}
