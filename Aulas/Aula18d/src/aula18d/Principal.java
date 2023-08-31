/**
 * TODO 1: Acrescente um bloco try-catch que capture a 
 *          excecao especifica disparada pelo metodo 'leitura'
 *          quando o usuario informa uma letra ao inves de um numero
 *          na leitura do "Numerador: ".
 * TODO 2: Mostre uma mensagem personalizada quando a excecao 
 *          do item anterior for capturada.
 * TODO 3: Acrescente uma captura de excecao quando o usuario informar
 *          um denominador igual a zero.
 * TODO 4: Mostre uma mensagem personalizada quando a excecao 
 *          do item anterior for capturada.
 * TODO 5: Acrescente uma captura de excecao generica "Exception" 
 *          apos a captura das excecoes mais especificas.
 */

package aula18d;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Principal {

   public void leitura() {
          Scanner entrada = new Scanner(System.in);

          int numerador=0;
          int denominador=0;
          float resultado=0;

        try {
              System.out.println("\nNumerador: ");
              numerador = entrada.nextInt();      
              System.out.println("\nDenominador: ");
              denominador = entrada.nextInt();
              if ( denominador == 0 )
                   throw new ArithmeticException(); //ordem
              else
                   resultado = numerador / denominador;
                   
        } catch (InputMismatchException ex){
            System.out.println("1) Excecao: entrada invalida");
        } catch( ArithmeticException ex){
            System.out.println("2) Excecao: divisao por zero");
        } catch( Exception ex ){
            System.out.println("3) Excecao: generica");
        }
  }

   public void iniciar(){

        //TODO1
        
        //TODO2
        
        //TODO3
        
        //TODO4
        
        //TODO5
            leitura();
        
          
    }

    public static void main( String [ ] args ){

         Principal principal = new Principal();
         principal.iniciar();
   }
}
