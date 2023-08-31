
package exercicio1;

public class Professor extends Universidade implements IUniversidade{
    private String nome = "Arnald";
    private float salario; 
    private String RP;
    private String endereco = "Rua Arthur, 318";
    
    
    
    public Professor(float salario) {
        this.salario = salario;
    }
    
    public Professor(float notaAvaliacao, String RP) {
        this.salario = notaAvaliacao;
        this.RP = RP;
    }

    public void setSalario(String salario) {
        this.RP = RP;
    }

    public void notaGeral(float notaAvaliacao, float notaGeral){
        notaGeral = 0.75f * notaAvaliacao;
    } 
    

    public String nomePessoa(){
        return nome ;
    }
    
    public String Endereco(){
        return endereco;
    }   

    
    public String toString() {
        return "Professor{" + "nome=" + nome + ", salario=" + salario + ", RP=" + RP + ", endereco=" + endereco + '}';
    } 
        
    
}
