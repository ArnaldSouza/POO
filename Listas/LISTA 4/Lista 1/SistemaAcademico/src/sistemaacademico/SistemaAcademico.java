/*
* a) Arnald Souza e Luis Henrique Ferracciu Pagotto Mendes
* b) Está com um pequeno erro na linha " / RA: " + this.ra;. No lugar do ";", deveria ser usado um "+".
* c) Nova funcionalidade: Texto para iniciar leitura de dados e leitura de email.
* d) Entrada:
* Chiquinho
* 123.456.789-10
* 753159
* Quimica
* chiquinho@hotmail.com
* Saida:
* Nome: Chiquinho / CPF: 123.456.789-10 / RA: 753159 / CURSO: Quimica / EMAIL: chiquinho@hotmail.com
*/
package sistemaacademico;

import java.util.Scanner;

public class SistemaAcademico {

public static void main(String[] args) {
    System.out.println("Insira os dados!");
    System.out.println("Nome, CPF, RA, Curso e Email, respectivamente: ");
    Scanner entrada = new Scanner(System.in);

    String nome = entrada.next();
    String cpf = entrada.next();
    int ra = Integer.parseInt(entrada.next());
    String curso = entrada.next();
    String email = entrada.next();

    Estudante et = new Estudante(nome, cpf, ra, curso, email);
        System.out.println(et);
    }
}