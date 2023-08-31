
package aula14b;

public class Cubo extends Forma3D {
    private float base;
    
    public Cubo(float base){
        this.base = base;
    }
    
    public float getArea(){
        return (float) (Math.pow(base,2 ) * 6);
    }
    
    public float getVolume(){
        return (float) (Math.pow(base,3 ));
    }
}

