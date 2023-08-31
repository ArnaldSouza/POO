
package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    
    
    
    public void iniciar(){
        float e = 0;
        Gotejador g = new Gotejador();
        
        try{        
              
            System.out.println("Digite o valor total dos equipamentos: ");
            Scanner entrada = new Scanner(System.in);
            e = entrada.nextInt();
            g.setValor(e);
            g.getValor();
        
        }catch(InputMismatchException a){
            System.out.println("Entrada errada de dados");
        }
        
        System.out.println("Valor do equipamento: " + g.getValor() + " reais");
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
