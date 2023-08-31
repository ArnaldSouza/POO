
package aula14c;

import java.util.ArrayList;


public class Principal {

public interface EmissaoCarbono {
    public abstract float getEmissaoCarbono();
}

public class Construcao implements EmissaoCarbono {
    
    private float altura;
    
    public float getAltura(){
        return this.altura;
    }
    
    public float getEmissaoCarbono(){ 
        return  altura * 10.0f;
    }
    
}

public class Carro implements EmissaoCarbono {
    
    private String marca;
    
    public String getMarca(){
     return this.marca;
    }
    
    public float getEmissaoCarbono(){ 
        return 100.0f; 
    }
}

public class Bicicleta implements EmissaoCarbono {
    
    private String tipo;
    
    public String getTipo(){
        return this.tipo;
    }
   
    public float getEmissaoCarbono(){
        return 0.0f;  
    }
}

    public void iniciar(){
        ArrayList <EmissaoCarbono>   lista = new ArrayList<>();
        lista.add(  new Construcao()  );
        lista.add(  new Carro() );
        lista.add(  new Bicicleta() );
        
        for( EmissaoCarbono objeto : lista )
            System.out.println(objeto.getEmissaoCarbono() );                

    }

    public static void main( String [ ] args ){
        new Principal().iniciar();
    }


}//fim classe Principal

