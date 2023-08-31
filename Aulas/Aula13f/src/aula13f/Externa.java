
package aula13f;

public class Externa {

     public interface  Interna {
            final int var = 111;
            public abstract void imprimir();
     }

     public Externa(){
            
            //Classe interna anonima: eh uma classe que implementa a interface

            Interna interna = new Interna(){  //Classe que implementa a interface
                      public void imprimir(){
                               System.out.println("222" + var);
                      }
            };
            interna.imprimir();
     }

     public static void main( String [ ] args ){
              Externa externa = new Externa();
     }

}
