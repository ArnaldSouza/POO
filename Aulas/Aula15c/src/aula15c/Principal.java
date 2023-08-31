
package aula15c;

import java.util.ArrayList;

public class Principal {
    
    public interface Bicicleta{
        
        public abstract float getAro();
        public abstract float cadastrar();
    }
    
    public class MountainBike implements Bicicleta{
        private float aro;
        
        public MountainBike(float aro){
            this.aro =aro;
        }
        
        public float getAro(){
            return this.aro;
        }
        public float cadastrar(){ 
            return getAro();
        }
    }
    
    public class Speed implements Bicicleta{
        private float aro;
        
        public Speed(float aro){
            this.aro =aro;
        }
        
        public float getAro(){
            return this.aro;
        }
        public float cadastrar(){ 
            return getAro();
        }
    }
    
    public class Ergonomica implements Bicicleta{
        private float aro;
        
        public Ergonomica(float aro){
            this.aro =aro;
        }
        
        public float getAro(){
            return this.aro;
        }
        public float cadastrar(){ 
            return getAro();
        }
    }
    
    public Principal(){
        ArrayList<Bicicleta> lista = new ArrayList<Bicicleta>();
        
        Bicicleta bicicleta = new MountainBike(47.2f);
        lista.add(bicicleta);
        
        bicicleta = new Speed(310.5f);
        lista.add(bicicleta);
        
        bicicleta = new Ergonomica( 18.22f );   //polimorfismo
        lista.add( bicicleta );

        
        for(Bicicleta b : lista)
            System.out.println(b.cadastrar());
    }
    
    public static void main(String[] args) {
        new Principal();
    }
    
}
