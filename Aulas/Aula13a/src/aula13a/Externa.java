package aula13a;

public class Externa {
          private int var=111;


          //public class Interna { //Esta disponivel para outras classes
          //private class Interna { //Classes externas nao tem acesso
          private static class Interna {   //Classe isolada 
                  private int var = 222;
                  public void imprimir(){
                        System.out.println("INTERNA: " + var);
                  }
          }

          public void imprimir(){
                  System.out.println("EXTERNA");
         }

         public static void main( String [ ] args ){

                Externa externa = new Externa();
                externa.imprimir();
                //Externa.Interna  interna = new Externa().new Interna();
                //interna.imprimir();
                
               Interna interna = new Interna();
               interna.imprimir();
         }
}

