
package aula10a;


public final class Sapo implements IAnimal {
      @Override
      public void andar(){
          System.out.println("ANDAR SAPO");
      }
      @Override
      public int getPernas(){
           return 2;
      }
      //Sobrescrita
      @Override
      public boolean temPelos(){
          return false;
      }
      
      @Override
      public final boolean temOlhos(){
               return true;
      }
}

