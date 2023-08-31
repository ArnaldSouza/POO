/**
 * TODO 1: Crie uma classe interna 'MinhaExcecao' que seja subclasse da
 *          classe ArithmeticException.
 * TODO 2: No metodo leitura, dispare a excecao personalizada 'MinhaExcecao' quando
 *          o denominador for igual a zero.
 * TODO 3: Implemente no bloco catch do metodo 'iniciar' a 
 *          captura da excecao personalizada 'MinhaExcecao'
 */
package aula18e;

import java.util.Scanner;
public class Principal {

   //TODO 1
   public class MinhaExcecao extends ArithmeticException {
       
       public MinhaExcecao(){
       }
       public MinhaExcecao(String mensagem){
            super(mensagem);
       }
       public int corrigir(int entrada){
           return -1;
       }
   }

   public void leitura( int denominador ) {
          Scanner entrada = new Scanner(System.in);

          int numerador=0;
          
          float resultado=0;

              System.out.println("\nNumerador: ");
              numerador = entrada.nextInt();      
              System.out.println("\nDenominador: ");
              denominador = entrada.nextInt();
              if ( denominador == 0 )
                   //TODO 2: 
                   throw new MinhaExcecao("Divisao por zero.");
              else
                   resultado = numerador / denominador;
  }

   public void iniciar(){
          int denominador=0;
          try {  
            leitura( denominador );              
          } catch ( MinhaExcecao ex ){
                System.out.println(
                    "1: Excecao personalizada: Erro na entrada de dados"
                );
                System.out.println( ex.getMessage() );
                denominador = ex.corrigir( denominador );
                
                System.out.println("Valor corrigido: " + denominador);
                
          }
          System.out.println("Programa continua");
    }


    public static void main( String [ ] args ){

         Principal principal = new Principal();
         principal.iniciar();
   }
}
