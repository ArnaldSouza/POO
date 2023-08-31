
package aula13e;


public class Externa {

     public abstract class Interna {
            protected int var = 111;
            public void imprimir(){
                   System.out.println(var);
            }  

     }

     public Externa(){
            
            //Classe interna anonima: eh uma subclasse da classe

            Interna interna = new Interna(){  //Classe interna anonima
                      public void imprimir(){
                               System.out.println("222 " + var);
                      }
            };
            interna.imprimir();

     }

     public static void main( String [ ] args ){
              Externa externa = new Externa();
     }

}

