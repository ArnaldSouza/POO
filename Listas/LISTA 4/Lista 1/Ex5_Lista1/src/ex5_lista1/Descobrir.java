package ex5_lista1;

import java.util.Random;

public class Descobrir{

	int numero;
	
	public void gerador() {
		
		Random gerador = new Random();		
		this.numero = gerador.nextInt(11);	
			
	}
	
	public int verificador(int aposta,Tentativas tent) {
		if(aposta > this.numero) {
			tent.maior();
			System.out.println("É menor!");
			return 0;
		}else {
			if(aposta < this.numero) {
			tent.menor();
			System.out.println("É Maior!");
			return 0;
			}
		}
		return 1;
	
	}		
}