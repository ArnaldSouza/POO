
package aula8a;


//Subclasse
public class Estagiario extends Estudante{
    
    private String empresa;
    private String horarioEstagio;
    
    public Estagiario(){
        
    }
    
    public Estagiario(String empresa, String horarioEstagio){
        super();
        this.empresa = empresa;
        this.horarioEstagio = horarioEstagio;
    }
    
        
    public Estagiario(String nome, String empresa, String horarioEstagio, float salario){
        super(nome, salario);
        this.empresa = empresa;
        this.horarioEstagio = horarioEstagio;
    }
}

