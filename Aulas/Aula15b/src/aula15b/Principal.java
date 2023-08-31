
package aula15b;

import java.util.ArrayList;

public class Principal {
    
    public abstract class Bicicleta{
        protected float aro;
        public Bicicleta(float aro){
            this.aro = aro;
        }
        public abstract float getAro();
        public abstract float cadastrar();
    }
    
    public class MountainBike extends Bicicleta{
        public MountainBike(float aro){
            super(aro);
        }
        
        public float getAro(){
            return this.aro;
        }
        public float cadastrar(){ 
            return getAro();
        }
    }
    
    public class Speed extends Bicicleta{
        public Speed(float aro){
            super(aro);
        }
        
        public float getAro(){
            return this.aro;
        }
        public float cadastrar(){ 
            return getAro();
        }
    }
    
    public class Ergonomica extends Bicicleta{
        public Ergonomica(float aro){
            super(aro);
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
