/*
Exercicio 8
Autor: Arnald Souza
Data: 03/12/2022
*/
package exercicio8;

public class Conta {
    private String nome;
    private String nomeUsuario;
    private String email;
    private String senha;
    private static Conta conta;

    private Conta(){
    }
    
    public static Conta iniciar(){
        if(conta == null){
            conta = new Conta();
            return conta;
        }else{
            return null;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
