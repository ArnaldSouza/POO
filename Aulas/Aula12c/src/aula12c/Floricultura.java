
package aula12c;

import java.util.Scanner;
public final class Floricultura 
              extends AFloricultura implements ILeitura {

     public void imprimir(){
             System.out.println("FLORICULTURA");
    }

     public void ler(){
          Scanner entrada = new Scanner(System.in);
          System.out.println("Nome da floricultura: ");
          String nome = entrada.next();
          imprimir();
     }

}


