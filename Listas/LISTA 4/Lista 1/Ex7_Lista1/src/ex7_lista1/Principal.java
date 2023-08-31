package ex7_lista1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
		
	Scanner texto = new Scanner(System.in);	
	Pendulo pend = new Pendulo();
	
	int cont = 0;
	int time;
	
	System.out.println("Qual o tempo (em segundos) necessário para realizar uma oscilação?");
	time = texto.nextInt();
	
	
	while(pend.a < 30 ) {
		pend.pendulo();

		System.out.println("A["+ pend.a +",30]  |  B["+ pend.b +",30]  |  C["+ pend.c + ",30]");
		cont++;
		}	
	
	Tempo t = new Tempo();
	
	t.calculo(cont,time);
	System.out.println("O tempo necessário para realizar todas as oscilações foi:");
	System.out.println("Horas:"+t.h+" Minutos:"+t.m+" Segundos: "+t.s);
	
	}
}