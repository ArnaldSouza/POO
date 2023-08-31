
package aula17g;

import java.util.Scanner;

public class Principal {

    public class MinhaExcecao extends ArithmeticException{
        public MinhaExcecao(String mensagem ){
            super(mensagem);
        }
        public int corrigir(int denominador){
            int result = 0;
            if(denominador == 0)
                result = -1;
            return result;
        }
    }
    
    public void leitura(int denominador) {
        Scanner entrada = new Scanner(System.in);

        int numerador=0;        
        float resultado=0;

        System.out.println("Numerador: ");
        numerador = entrada.nextInt();      
        
        
        if ( denominador == 0 )
            throw new MinhaExcecao("1: Excecao - divisao por zero");
        else
            resultado = numerador / denominador;
  }

    public void iniciar(){

        Integer [ ] vetor = new Integer[2];

        int b = 0;

        try {            
            leitura(b);              
        }catch (MinhaExcecao e ){
            System.out.println(e);
            b = e.corrigir(b);
            leitura(b); //programa em um estado valido
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
