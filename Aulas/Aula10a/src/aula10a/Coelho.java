
package aula10a;

public final class Coelho extends Animal implements ICoelho {

     public void andar(){
            System.out.println("ANDAR COELHO");
     }
     public int getPernas(){
            return 4;
     }
  /*   public bool temPelos(){
             return true;
     }
  */
}

