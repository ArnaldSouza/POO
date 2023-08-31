
package bd;


import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String CPF;
    private String endereco;

    public Cliente() {
        setNome("");
        setCPF("0");
        setEndereco("");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
    
    public String getEndereco() {
        return endereco;
    }

}
