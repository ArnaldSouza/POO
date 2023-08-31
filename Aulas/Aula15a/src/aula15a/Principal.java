
package aula15a;


public class Principal {

    public abstract class Animal{
        public abstract void caminhar();
    }
    
    public class Sapo extends Animal {
        public void caminhar() {   
            System.out.println("PULAR"); 
        }
    }
    
    public class Leao extends Animal {
        public void caminhar() {
            System.out.println("ANDAR");
        }            
    }

    public Principal(){
        Animal animal;
        animal = new Sapo();
        animal.caminhar();
        
        animal = new Leao();
        animal.caminhar();
    }  
          
    
    public static void main(String[] args) {
        new Principal();
    }
    
}
