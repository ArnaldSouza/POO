
package aula15d;


public class Principal {

    public class Ponto{
        protected float x;
        protected float y;
        
        public Ponto(float x, float y){
            this.x = x;
            this.y = y;
        }
        
        public String toString(){
            return "SOU UM PONTO: X: " + x + " Y: " + y; 
        }
    }
    
    public class Circulo extends Ponto{
        private float raio;
        
        public Circulo(float x, float y, float raio){
            super(x,y);
            this.raio = raio;
        }
        
        public String toString(){
            return "Sou um circulo: \n X:" + x + " Y:" + y + " Raio:" + raio;
        }
    }
    
    public Principal(){
        Ponto p = new Circulo(4.0f,3.0f,1.0f);
        System.out.println(p);
        
        Circulo c = new Circulo(5.0f,2.0f,22.0f);
        c = (Circulo) p;
        System.out.println(c);
        
        p = new Ponto(7.0f,10.0f);
        System.out.println(p);
        
    }
    
    
    public static void main(String[] args) {
        new Principal();
    }
    
}
