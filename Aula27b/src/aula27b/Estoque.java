
package aula27b;

import java.util.ArrayList;


//TODO1
import java.util.ArrayList;
public class Estoque {
    
    private static Estoque objeto;
    private ArrayList<Principal.MaterialEscolar> lista;
    
    private Estoque(ArrayList<Principal.MaterialEscolar> lista){
        System.out.println("CRIADO");
        
        this.lista = lista;
    }
    public ArrayList<Principal.MaterialEscolar> getLista(){
        return this.lista;
    }
    public static Estoque iniciar(
        ArrayList<Principal.MaterialEscolar> lista){
        
        if( objeto == null )
            objeto = new Estoque( lista );
            
        return objeto;
    }

}

