package aula8a;
    
public class Aula8a {
    
    public Aula8a(){
       Estagiario Maria = new Estagiario("UTFPR","MATUTINO");
       Maria.setNome("Maria");
       
       Estagiario Arnald = new Estagiario("Arnald", "UTFPR","MATUTINO",4300.0f);
        System.out.println(Arnald.getSalario());
    }
    
    public static void main(String[] args) {
        Aula8a aula8 = new Aula8a();
        aula8.iniciar();
    }
    
    public void iniciar(){
        
    }
}
