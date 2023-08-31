
package aula27a;


public class Singleton {

    private static Singleton objeto;
    
    private Singleton(){
        System.out.println("Criado");
    }

    public static Singleton iniciar(){
        if(objeto == null){
            objeto = new Singleton();
            return objeto;
        }else 
            return null;
    }
    
}
