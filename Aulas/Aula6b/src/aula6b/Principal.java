
package aula6b;

import java.util.ArrayList;


public class Principal {

      public static void main(String [ ] args){
           Principal principal = new Principal();
           principal.iniciar();
      }
      
      public void iniciar(){
          Estudante Arnald = new Estudante("Arnald");
          Curso poo = new Curso("POO");
          poo.add(Arnald); //objeto foi adicionado a lista do curso
          
          ArrayList<Estudante> conteudoLista = poo.getEstudantes();
          for ( Estudante estudante : conteudoLista)
                 System.out.println( estudante );


      }
}


