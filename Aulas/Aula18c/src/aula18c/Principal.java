
package aula18c;

/**
 * TODO 1: Faca a captura da excecao no trecho indicado: "TODO 1" no codigo-fonte.
 * TODO 2: Mostre uma mensagem personalizada na captura da excecao do item anterior.
 * TODO 3: Faca a captura da excecao no trecho indicado: "TODO 3" no codigo-fonte.
 * TODO 4: Mostre uma mensagem personalizada na captura da excecao do item anterior.
 * TODO 5: Faca a captura das excecoes dos itens TODO 1 e TODO 3 em um mesmo
 *          bloco try-catch.
 */

public class Principal {

   public void leitura(int numerador, int denominador) {
          
          float resultado=0;

              if ( denominador == 0 )
                   throw new ArithmeticException();
              else
                   resultado = numerador / denominador;
  }

   public void iniciar(){

        Integer [ ] vetor = new Integer[2];

        //TODO 1
        int a=0, b=0;
        try{
            b = vetor[20];
            leitura( a, b ); 
        }catch(ArrayIndexOutOfBoundsException ex){
            //TODO 2  
            System.out.println("\n Excecao: indice invalido");    
        }catch(ArithmeticException ex){
            System.out.println("\n Excecao: divisao por zero");
        }
           
    }


    public static void main( String [ ] args ){

         Principal principal = new Principal();
         principal.iniciar();
   }
}