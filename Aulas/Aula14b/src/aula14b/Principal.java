
package aula14b;

public class Principal {
    
    public Principal(){
    
        Forma [ ] lista = new Forma[4];

        Circulo c1 = new Circulo(1.23f);
        lista[0] = c1;          //Forma (superclasse) ←Circulo (subclasse)

        Triangulo t1 = new Triangulo(4.56f, 2f);
        lista[1] = t1;         //Forma (superclasse) ← Triangulo (subclasse)

        Cubo c2 = new Cubo( 7.89f );
        lista[2] = c2;         //Forma (superclasse) ← Cubo (subclasse)

        Esfera e1 = new Esfera( 5.67f );
        lista[3] = e1;       //Forma (superclasse) ← Esfera (subclasse)

        for(  Forma forma : lista )
            System.out.println(  forma );

           }

   
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
