
package aula14b;

public abstract class Forma {
    protected float area;
    
    public Forma(){
        
    }
    
    public Forma(float area){
        this.area = area;
    }
    
    public abstract float getArea();
    
}
