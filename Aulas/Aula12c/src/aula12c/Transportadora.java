
package aula12c;

import java.util.Scanner;

public class Transportadora implements IFloricultura, ILeitura {
    
     public void imprimir(){
             System.out.println(this.getClass().getSimpleName());
    }
    public void ler(){
          Scanner entrada = new Scanner(System.in);
          System.out.println("Nome da Transportadora: ");
          String nome = entrada.next();
          imprimir();
     }

}

