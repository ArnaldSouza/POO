
package aula9a;

import java.util.ArrayList;


public class Floricultura extends MicroEmpresa{
    private ArrayList<Cliente>lista;
    
    public Floricultura(){
        lista = new ArrayList<>();
    }
    
    public void add(Cliente cliente){
        lista.add(cliente);
    }
}

