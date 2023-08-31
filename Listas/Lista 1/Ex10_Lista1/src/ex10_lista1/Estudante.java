
package ex10_lista1;

public class Estudante {

    private String nome;
    private String disciplina;
    private String curso;
    private String ra;
    private String CPF;
    private int idade;

    public Estudante(String nome, String disciplina, String curso,
            String ra, String CPF, int idade) {
        setNome(nome);
        setDisciplina(disciplina);
        setCurso(curso);
        setRA(ra);
        setCPF(CPF);
        setIdade(idade);
    }

    public String getCurso() {
        return this.curso;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRa() {
        return this.ra;
    }

    public String getCPF() {
        return this.CPF;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setRA(String ra) {
        this.ra = ra;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "\nNome: " + getNome() +
                "\nDisciplina: " + getDisciplina() +
                "\nCurso: " + getCurso() + "\nRA: " +
                getRa() + "\nCPF: " + getCPF() + 
                "\nIdade:" + getIdade();
    }

}