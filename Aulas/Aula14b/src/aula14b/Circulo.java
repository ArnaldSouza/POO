
package aula14b;


public class Circulo extends Forma2D {
    
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float getArea(){
        return (float) ( Math.PI*Math.pow(raio,2) );
    }
}

