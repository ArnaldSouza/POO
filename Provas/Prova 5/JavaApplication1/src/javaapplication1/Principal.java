
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
       ArrayList<> lista = new ArrayList<>();
                                                         
           lista.add(new Nomeacao());  //lista.add(obj);
           lista.add(new TempoVida());
           lista.add(new Nascimento());

           Iterator i = lista.iterator();
           while( i.hasNext() )
                     //System.out.println(i.next().getTensao());
                     System.out.println(i.next());
          

    }
    
}
