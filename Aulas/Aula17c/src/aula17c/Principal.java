
package aula17c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    
    public void leitura(){
        int numerador = 0; 
        int denominador = 0;
        float resultado = 0; 
        
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Numerador: ");
        numerador = entrada.nextInt();
        System.out.println("Denominador: ");
        denominador = entrada.nextInt();
        resultado = numerador / denominador;
        
        if ( denominador == 0 )
            throw new ArithmeticException();
        else
            resultado = numerador / denominador;

    }
    
    public void iniciar(){
        
        Integer [] vetor = new Integer[2];
        
        int b = 0;        
                
        try{
            leitura();
            b = vetor[20];
        }catch(InputMismatchException e){
            System.out.println("1:Exceção na entrada de dados");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("2: Não é possivel dividir por 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("3: Indice de posição fora dos limites");
            b = 01;
        }
        
        System.out.println("Programa continua");
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}

