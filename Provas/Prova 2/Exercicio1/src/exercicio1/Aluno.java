
package exercicio1;

public class Aluno extends Universidade implements IUniversidade {
    private String nome = "Hirata";
    private String RA; 
    private float notaProva;
    private String endereco = "Rua Marques, 54";

    public Aluno(String RA) {
        this.RA = RA;
    }

    public Aluno(String RA, float notaProva) {
        this.RA = RA;
        this.notaProva = notaProva;
    }
    
    public void setRA(String RA){
        this.RA = RA;
    }
    
    public void notaMedia(float notaAnterior, float notaProva, float media){
        media = notaAnterior + notaProva / 2;
    }
            
    public String nomePessoa(){
        return nome;
    }
    
    public String Endereco(){
        return endereco;
    } 

    public String toString() {
        return "Aluno{" + "nome=" + nome + ", RA=" + RA + ", notaProva=" + notaProva + ", endereco=" + endereco + '}';
    }
    
    
}
