
package aula9a;

public class MicroEmpresa extends Empresa{
    private String responsavel;
    
    public MicroEmpresa(){
        responsavel = "Fulano";
    }
    
    public String getResponsavel(){
        return this.responsavel;
    }
}

