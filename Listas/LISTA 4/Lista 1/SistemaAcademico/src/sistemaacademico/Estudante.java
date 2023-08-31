
package sistemaacademico;


import java.util.Scanner;

public class Estudante {
    private String nome;
    private String cpf;
    private int ra;
    private String curso;
    private String email;

    public Estudante(String nome, String cpf, int ra, String curso, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
        this.curso = curso;
        this.email = email;
    }

    public String toString(){
        return "Nome: " + this.nome +
                " / CPF: " + this.cpf +
                " / RA: " + this.ra +
                " / CURSO: " + this.curso +
                " / EMAIL: " + this.email;
    }
}