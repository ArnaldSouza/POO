
package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public void iniciar(){
        List<IUniversidade> lista = new ArrayList<IUniversidade>();
        
        IUniversidade p = new Professor(12500.0f,"15487");
        lista.add(p);
        
        IUniversidade a = new Aluno("2271923",8.5f);
        lista.add(a);
        
        IUniversidade v = new Visitante(15,250);
        lista.add(v);
        
        for(IUniversidade b : lista)
            System.out.println(b);

        
    }
    
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
