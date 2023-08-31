/*
Exercicio 7
Autor: Arnald Souza
Data: 03/12/2022
*/
package exercicio7;

import java.util.ArrayList;


public class BDConta implements Iterator{
    ArrayList<Conta>lista;
    private int pos = 0;

    public BDConta(){
        lista = new ArrayList<>();
    }
    
    public void adicionar(Conta conta){
        lista.add(conta);
    }

    public boolean hasNext() {
        boolean result = false;
	if ( pos < this.lista.size())
            result = true;
	return result;
    }

    public Object next() {
        Conta conta  = this.lista.get(pos);
	pos++;
        System.out.println("Informacoes Adicionadas:\nNome: " + conta.getNome() + 
                "\nNome de usuario: " + conta.getNomeUsuario() +
                "\nEmail: " + conta.getEmail() + "\nSenha: " + conta.getSenha());
	return conta;
    }

        
}

