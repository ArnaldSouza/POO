
package aula14b;

public class Triangulo extends Forma2D {
    
    private float base, altura;
         
    public Triangulo(float base,float altura){
        this.base = base;
        this.altura = altura;
    }
    
    public float getArea(){
        return (float) (base * altura / 2);
    }

}
