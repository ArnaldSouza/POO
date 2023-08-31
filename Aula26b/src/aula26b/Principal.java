
package aula26b;


/**
 * TODO 1: Interface Iterator: defina os metodos abstratos:
 *            public boolean temProximo()
 *            public Object  proximo()
 * 
 * TODO 2: Classe MaterialEscolar: no construtor, atribua o parametro 'nome'
 *          ah variavel de instancia 'nome'
 * 
 * TODO3: Classe ItemIterator: defina que a classe deve implementar a 
 *          interface Iterator.
 * 
 * TODO4: Classe ItemIterator: descomente os trechos 'TODO4' e substitua
 *         por 'MaterialEscolar'
 * 
 * TODO5: Classe Principal: descomente os trechos 'TODO5' e substitua
 *         por 'MaterialEscolar'
 * 
 * TODO6: Classe principal: adicione o seguinte codigo no fim do metodo iniciar:
 *         Iterator i = new ItemIterator( lista );
           while( i.temProximo() )
              System.out.println( (MaterialEscolar) i.proximo() );
 * 
 */

import java.util.ArrayList;

public class Principal {
    ArrayList<MaterialEscolar> lista;
    public void iniciar(){
        lista = new ArrayList<>();
        lista.add(new MaterialEscolar("Lapis"));
        lista.add(new MaterialEscolar("Borracha"));
        
        //TODO6
        Iterator i = new ItemIterator( lista );
           while( i.temProximo() )
              System.out.println( (MaterialEscolar) i.proximo() );
        
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
}