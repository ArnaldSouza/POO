
package aula17h;

import java.util.Scanner;

public class Principal {
    
    public class ExcecaoVerificada extends Exception {
        public ExcecaoVerificada(String mensagem){
            super(mensagem);
        }

    }

    
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
    
    //throws: metodos , metodo pode disparar uma Exception
    //throw: acao, vai disparar a Exception
    
    public void leitura(int denominador) throws ExcecaoVerificada {
        Scanner entrada = new Scanner(System.in);

        int numerador=0;        
        float resultado=0;

        System.out.println("Numerador: ");
        numerador = entrada.nextInt();      
                
        if (denominador == 0)
            throw new ExcecaoVerificada("1: Excecao - divisao por zero");
        else
            resultado = numerador / denominador;
  }

    public void iniciar(){

        Integer [ ] vetor = new Integer[2];

        int b = 0;

        try { //obrigatorio usar try-catch           
            leitura(b);              
        }catch (ExcecaoVerificada e ){
            System.out.println(e);
            //b = e.corrigir(b);
            try{
                leitura(b);//programa em um estado valido
            } catch(ExcecaoVerificada e2 ){
                System.out.println(e2);
            }
        }   
        System.out.println("Programa continua");
    }

    public static void main(String [ ] args){
        Principal principal = new Principal();
        principal.iniciar();
   }
}