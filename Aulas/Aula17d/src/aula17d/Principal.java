
package aula17d;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public void leitura() {
        Scanner entrada = new Scanner(System.in);

        int numerador=0;
        int denominador=0;
        float resultado=0;

        System.out.println("\nNumerador: ");
        numerador = entrada.nextInt();      
        System.out.println("\nDenominador: ");
        denominador = entrada.nextInt();
        if ( denominador == 0 )
            throw new ArithmeticException();
        else
            resultado = numerador / denominador;
  }

   public void iniciar(){

        Integer [ ] vetor = new Integer[2];

        int b = 0;

        try {
            vetor[0]=1;
            b = vetor[0];
            leitura();              
        }catch (InputMismatchException e ){
            System.out.println("1: Excecao na entrada de dados");
        }catch (Exception e){
            System.out.println("4: Excecao generica");
        }   
        System.out.println("Programa continua");
    }

    public static void main(String [ ] args){
        Principal principal = new Principal();
        principal.iniciar();
   }
}

