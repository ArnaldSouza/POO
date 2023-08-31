
package aula7a;

public class Principal {
    
    public static void main(String[] args){
      Principal principal = new Principal();
      principal.iniciar();
    }
    
    public void iniciar(){  
        
        /*Girino girino = new Girino("Girino","Verde");
        System.out.println(girino.getNome());
        System.out.println(girino.getCor());*/
        
        CoelhoRajado coelhoRajado = new CoelhoRajado("Garfield", "Laranja", "15874747512",4); 
        System.out.println(coelhoRajado);
    }
    
}
