
package aula14b;

public abstract class Forma2D extends Forma{
    
    
    
    public Forma2D(){
        
    }
    
    public Forma2D(float area){
        super(area);
    }
    
    public abstract float getArea();
    
    public String toString(){
        return this.getClass().getSimpleName() + " Area: " + getArea();
    }

}
