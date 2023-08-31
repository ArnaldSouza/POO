
package exercicio1;

public  class Visitante extends Universidade implements IUniversidade{
    private String nome = "Isaac";
    private int idade;
    private int numero;
    private String endereco = "Rua dos Chapeus, 184";

    public Visitante(int idade) {
        this.idade = idade;
    }

    public Visitante(int idade, int numero) {
        this.idade = idade;
        this.numero = numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void verificaIdade(int idade){
        if(this.idade < 15){
            System.out.println("Menores de 15 anos não podem entrar");
        }else{
            System.out.println("Entrada Permitida");
        }
    }
    
    public String nomePessoa(){
        return nome;
    }
    
    public String Endereco(){
        return endereco;
    } 

    @Override
    public String toString() {
        return "Visitante{" + "nome=" + nome + ", idade=" + idade + ", numero=" + numero + ", endereco=" + endereco + '}';
    }
    
    
}
