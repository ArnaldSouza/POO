
package aula6b;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Estudante> lista;

    public Curso(String nome){
           this.nome = nome;
           lista = new ArrayList<Estudante>();
    }
    public void add(Estudante estudante){
          this.lista.add( estudante );
    }
    public ArrayList<Estudante> getEstudantes(){
         return (ArrayList<Estudante>) this.lista;
    }
}

