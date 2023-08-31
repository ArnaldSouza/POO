
package aula3b;

import java.util.Scanner;

public class Principal
{		

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor: ");
		double valor = entrada.nextDouble();
		
		Aleatorio op = new Aleatorio();
		double resultado = op.calcular(valor);
		
		System.out.println("Resultado: " + resultado);
		
		//

	}

}