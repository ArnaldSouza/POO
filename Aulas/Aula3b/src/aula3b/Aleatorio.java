

package aula3b;

import javax.swing.JOptionPane;

import java.security.SecureRandom;

public class Aleatorio {		

	int metodo1( int valor ){ return 0; }
	
	int metodo1( double valor ){ return 0; }
	
	public int calcular(double valor){ 

        int resultado;
		SecureRandom numeroAleatorio = new SecureRandom(); 
	
		resultado = 1 + numeroAleatorio.nextInt(6);
		
		return resultado;

	}

}

