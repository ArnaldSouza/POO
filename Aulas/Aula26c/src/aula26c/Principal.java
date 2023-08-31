
package aula26c;

/**
 * TODO1: Interface Iterator: defina os metodos abstratos:
 *            public boolean temAnterior()
 *            public Object  anterior()
 * 
 * TODO2: Classe ItemIterator: no fim do construtor, insira o codigo:
 *          this.pos = this.lista.size() - 1;
 * 
 * TODO3: Classe Principal: no metodo fim do metodo iniciar, insira o seguinte:
 *       Iterator i = new ItemIterator( lista );
 *       while( i.temAnterior() )
 *          System.out.println( (MaterialEscolar) i.anterior() );
 */


import java.util.ArrayList;

public class Principal {
    ArrayList<MaterialEscolar> lista;
    public void iniciar(){
        lista = new ArrayList<>();
        lista.add(new MaterialEscolar("Lapis"));
        lista.add(new MaterialEscolar("Borracha"));
        
        //TODO3
        Iterator i = new ItemIterator( lista );
        while( i.temAnterior() )
            System.out.println( (MaterialEscolar) i.anterior() );
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
}
