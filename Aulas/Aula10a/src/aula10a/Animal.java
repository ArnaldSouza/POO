
package aula10a;


public abstract class Animal implements IAnimal {
         protected final String tipo = "MAMIFERO";

         //@Override
         public final boolean temPelos(){
               return true;
         }
        public final boolean temOlhos(){
               return true;
        }
}

