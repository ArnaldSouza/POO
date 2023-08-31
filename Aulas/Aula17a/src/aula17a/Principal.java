
package aula17a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    
    public void iniciar(){
        Scanner entrada = new Scanner(System.in);
        int numerador = 0; 
        int denominador = 0;
        float resultado = 0; 
                
        try{
            System.out.println("Numerador: ");
            numerador = entrada.nextInt();
            System.out.println("Denominador: ");
            denominador = entrada.nextInt();
            resultado = numerador / denominador;
        }catch(InputMismatchException e){
            System.out.println("1:Exceção na entrada de dados");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("2: Não é possivel dividir por 0");
        }
        
        System.out.println("Programa continua");
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
