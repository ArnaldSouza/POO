
package aula8b;

import java.util.ArrayList;

public class Banco {
       private ArrayList<Cliente> lista;
       private String nome;

       public Banco(){
            lista = new ArrayList<>();
            this.nome = "BANCO";
       }
      public void add(Cliente cliente){
           lista.add( cliente );
      }
      public void del(Cliente cliente) {
      }
}//fim classe


