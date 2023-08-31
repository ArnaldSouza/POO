
package ex10_lista1;

import java.util.Scanner;

public class Principal {

    public Principal() { // construtor
   	 Scanner s = new Scanner(System.in, "latin1");
   	 String nome;
   	 String disciplina;
   	 String curso;
         String ra; 
         String CPF;
         int idade;

   	 System.out.println("Digite seu nome:");
   	 nome = s.nextLine();

   	 System.out.println("Digite sua disciplina:");
   	 disciplina = s.nextLine();

   	 System.out.println("Digite seu curso:");
   	 curso = s.nextLine();
         
         System.out.println("Digite o seu RA(exemplo: a123456): ");
         ra = s.nextLine();
         
         System.out.println("Informe o seu CPF (da forma: 123.456.789-10): ");
         CPF = s.next();
         
         System.out.println("Informe a sua idade: ");
         idade = s.nextInt();
         
   	 Estudante et = new Estudante(nome, disciplina, curso, ra, CPF,idade);

   	 System.out.println(et);
    }
    
    public static void main(String[] args) {
   	 new Principal();
    }
}


