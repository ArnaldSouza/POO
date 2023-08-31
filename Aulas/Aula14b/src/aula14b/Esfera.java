
package aula14b;
    
public class Esfera extends Forma3D {
    
    private float raio;
    
    public Esfera(float raio){
        this.raio = raio;
    }
    
    public float getArea(){
        return (float) (4*Math.PI*Math.pow(raio,2));
    }
    
    public float getVolume(){
        return (float) (4/3*Math.PI*Math.pow( raio, 3 ) );
    }

}

