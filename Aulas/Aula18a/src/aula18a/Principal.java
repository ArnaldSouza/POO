
package aula18a;

/**
 * TODO 1: Execute o programa e verifique na mensagem de erro o tipo da excecao.
 * TODO 2: Adicione o codigo para o tratamento da excecao.
 * TODO 3: Mostre uma mensagem personalizada quando a excecao eh capturada.
 * TODO 4: Exiba a pilha de execucao quando a excecao eh capturada.
 */

import java.util.Scanner;
public class Principal {

   public void iniciar(){

        int numerador=0;
        int denominador=0;
        float resultado=0;
          
        try{ 
            resultado = numerador / denominador;
        } catch (ArithmeticException objeto){
           System.out.println("Excecao, divisao por zero" + objeto.getMessage() );
           objeto.printStackTrace();
        }    

    }


    public static void main( String [ ] args ){

         Principal principal = new Principal();
         principal.iniciar();
   }
}

