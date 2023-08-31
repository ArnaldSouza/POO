
package aula9a;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    
    public Empresa(){
        cnpj = "312132321";
        razaoSocial = "BK";
    }
    
    public String toString(){
        return "CNPJ: "+cnpj+
                "\nRazao social: "+razaoSocial;
    }
    
}
