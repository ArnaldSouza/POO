
package aula27a;


public class Principal {

    public void iniciar(){
        Singleton obj = Singleton.iniciar();
        Singleton obj2 = Singleton.iniciar();
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
