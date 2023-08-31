
package aula14b;

public abstract class Forma3D extends Forma {

    public void Forma3D(){
        
    }
    
    public abstract float getVolume();

    public String toString(){
    
    return this.getClass().getSimpleName() + 
        " Area: " + getArea() + 
        " Volume: " + getVolume();
    }
}

