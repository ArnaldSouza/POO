
package ex1_lista1;

import java.util.Scanner;
import java.lang.Math;

public class ex1_lista1 {

    
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      
      Time time = new Time();
      
      System.out.println("*** 'Calculadora' ***");
      System.out.println("****** 1 - Abs   **********");
      System.out.println("****** 2 - Ceil  **********");
      System.out.println("****** 3 - Cos   **********");
      System.out.println("****** 4 - Exp   **********");
      System.out.println("****** 5 - Floor **********");
      System.out.println("****** 6 - Log   **********");
      System.out.println("****** 7 - Max   **********");
      System.out.println("****** 8 - Min   **********");
      System.out.println("****** 9 - Pow   **********");
      System.out.println("****** 10 - Sqrt **********");
      
      System.out.println("Selecione o que deseja realizar: ");     
      int opcao = num.nextInt();
      
      double num1;
      double num2;
      
      long aux;
      aux = System.currentTimeMillis();
      time.setInitialTime(aux);
      
      
      switch (opcao){
          case 1: //abs
              System.out.println("Digite o valor: ");
              num1 = num.nextDouble();              
              System.out.println("Valor absoluto: " +Math.abs(num1));
              break;
          
          case 2: //ceil
              System.out.println("Digite o valor: ");
              num1 = num.nextDouble();              
              System.out.println("Valor aproximado para cima: " +Math.ceil(num1));
              break;
              
          case 3: //cos
              System.out.println("Digite o valor do angulo em radianos: ");
              num1 = num.nextDouble();
              System.out.println("Cosseno: " +Math.cos(num1));
              break;
              
          case 4: //exp
              System.out.println("Digite o valor: ");
              num1 = num.nextDouble();
              System.out.println("e elevado a:" +num1 +" é igual a:" +Math.exp(num1));
              break;
              
          case 5: //floor
              System.out.println("Digite o valor: ");
              num1 = num.nextDouble();
              System.out.println("Valor aproximado para baixo: " +Math.floor(num1) );
              break;
          
          case 6: //log
              System.out.println("Digite o valor: ");
              num1 = num.nextDouble();
              System.out.println("Logaritmo de " +num1 +" é igual a " +Math.log(num1));
              break;
          
          case 7: //max
              System.out.println("Digite o valor 1: ");
              num1 = num.nextDouble();
              System.out.println("Digite o valor 2: ");
              num2 = num.nextDouble();              
              System.out.println("O maior valor é: " +Math.max(num1,num2));              
              break;
              
          case 8: //min 
              System.out.println("Digite o valor 1: ");
              num1 = num.nextDouble();
              System.out.println("Digite o valor 2: ");
              num2 = num.nextDouble();             
              System.out.println("O menor valor é: " +Math.min(num1,num2));              
              break;
              
          case 9: //pow
              System.out.println("Digite a base:");
              num1 = num.nextDouble();
              System.out.println("Digite o expoente: ");
              num2 = num.nextDouble();              
              double total = Math.pow(num1,num2);              
              System.out.println(+num1 +" elevado a " +num2 +" é igual a " +Math.pow(num1,num2));
              break;
              
          case 10: //sqrt
              System.out.println("Digite o número: ");
              num1 = num.nextDouble();
              System.out.println("A raiz quadrada de " +num1 +" é igual a " +Math.sqrt(num1));
              break;
              
          default: //opção invalida
              System.out.println("Opção Inválida !!!");
              break;
      }
      
      aux = System.currentTimeMillis();
      time.setFinalTime(aux);      
      time.setTotalTime().getTotalTime();      
      num.close();      
      }        
       
}