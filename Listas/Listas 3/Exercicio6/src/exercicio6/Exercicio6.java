/*
Exercicio 6
Autor: Arnald Souza
Data: 03/12/2022
*/
package exercicio6;

import javax.swing.JOptionPane;


public class Exercicio6 {

    public abstract class Facade{
        public abstract void iniciar();
    }
    
    public Exercicio6() {
        JOptionPane.showMessageDialog(null, "Bem Vindo, vamos iniciar!", "INICIO", JOptionPane.PLAIN_MESSAGE);
        Conta conta =  new Conta();
        conta.iniciar();
    }
    
    public class Conta extends Facade{
        private String nome;
        private String nomeUsuario;
        private String email;
        private String senha;

        public String getNome() {
            return nome;
        }

        public void setNome() {
            this.nome = JOptionPane.showInputDialog(null, "Insira seu Nome:", "NOME", JOptionPane.PLAIN_MESSAGE);
            String msg;
            if(this.nome.compareTo("") != 0)
                msg = "Nome armazenado: " + this.nome;
            else
                msg = "Erro !!!";
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        }

        public String getNomeUsuario() {
            return nomeUsuario;
        }

        public void setNomeUsuario() {
            this.nomeUsuario = JOptionPane.showInputDialog(null, "Insira seu Nome de Usuario:", "NOME DE USUARIO", JOptionPane.PLAIN_MESSAGE);
            String msg;
            if(this.nomeUsuario.compareTo("") != 0)
                msg = "Nome de Usuario armazenado: " + this.nomeUsuario;
            else
                msg = "Erro !!!";
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail() {
            this.email = JOptionPane.showInputDialog(null, "Insira seu Email:", "NOME DE USUARIO", JOptionPane.PLAIN_MESSAGE);
            String msg;
            if(this.email.compareTo("") != 0)
                msg = "Email armazenado: " + this.email;
            else
                msg = "Erro !!!";
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha() {
            this.senha = JOptionPane.showInputDialog(null, "Insira sua senha:", "SENHA", JOptionPane.PLAIN_MESSAGE);
            String msg;
            if(this.senha.compareTo("") != 0)
                msg = "Senha armazenado: " + this.senha;
            else
                msg = "Erro !!!";
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        }
        
        public void setInformacao(){
            String info;
            info = " Nome: " + this.nome +
                    "\n Nome de usuario: " + this.nomeUsuario +
                    "\n Senha armazenado: " + this.senha + 
                    "\n Email: "+ this.email;
                   
            
            JOptionPane.showMessageDialog(null, info, "", JOptionPane.INFORMATION_MESSAGE);
        }
        
        public void iniciar(){
            setNome();
            setNomeUsuario();
            setEmail();
            setSenha();
            setInformacao();
        }
        
    }
    
    
    public static void main(String[] args) {
        Exercicio6 novo = new Exercicio6();
    }
    
}
