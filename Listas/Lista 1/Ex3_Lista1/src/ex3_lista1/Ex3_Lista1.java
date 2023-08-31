package ex3_lista1;

import java.util.Scanner;

public class Ex3_Lista1 {

	public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
	
            String tipo;
            String placa;
	            
            System.out.println("Insira o tipo do veiculo:");
            tipo = texto.nextLine();
            System.out.println("Insira a placa do veiculo:");
            placa = texto.nextLine();
	  
            int h_entrada;
            int min_entrada;
            int h_saida;
            int min_saida;
            int tempo_entrada;
            int tempo_saida;
				
            int d;
            int m;
            int a;
		
            System.out.println("Insira a hora em que o veiculo entrou no estacionamento:(Exemplo: Se chegou as 15h07, digite '15')");
            h_entrada = texto.nextInt();
            System.out.println("Insira o minuto em que o veiculo entrou no estacionamento:(Exemplo: Se chegou as 15h07, digite '7')");
            min_entrada = texto.nextInt();
		
            String horario_saida = h_entrada+ "h"+ min_entrada;		
            h_entrada = h_entrada * 60;
            tempo_entrada = h_entrada + min_entrada;

	
            System.out.println("Insira a hora em que o veiculo saiu do estacionamento:(Exemplo: Se saiu as 17h15, digite '21')");
            h_saida = texto.nextInt();
            System.out.println("Insira o minuto em que o veiculo saiu do estacionamento:(Exemplo: Se chegou as 21h15, digite '15')");
            min_saida = texto.nextInt();
	
            String horario_entrada = h_entrada+ "h"+ min_entrada;	
            h_saida = h_saida * 60;
            tempo_saida = h_saida + min_saida;
	
            int tempo_estacionado = tempo_saida - tempo_entrada;

            Veiculo veiculo = new Veiculo(tipo,placa,horario_saida,horario_entrada,tempo_estacionado);
		
	//data	entrada
		System.out.println("Insira o dia em que o veiculo entrou:");
		d = texto.nextInt();
		
		System.out.println("Insira o mês em que o veiculo entrou:");
		m = texto.nextInt();
		
		System.out.println("Insira o ano em que o veiculo entrou:");
		a = texto.nextInt();
		
	int verifica = 1;
		veiculo.setData(d,m,a,verifica);
		
		//data entrada fim
		
		
	//data	saida
		System.out.println("Insira o dia em que o veiculo saiu :");
		d = texto.nextInt();
				
		System.out.println("Insira o mês em que o veiculo saiu :");
		m = texto.nextInt();
				
		System.out.println("Insira o ano em que o veiculo saiu :");
		a = texto.nextInt();
				
		verifica = 0;
		veiculo.setData(d,m,a,verifica);
				
	//data saida fim

		
	double valor = 0;
		
	if(veiculo.tempo >= 30 && veiculo.tempo <= 60) {
		valor = 10;
	}else {
		if(veiculo.tempo >60) {
			valor = 20;
		}
	}
	
	System.out.println("O valor a pagar é de R$ "+ valor);	
	
	texto.close();
	}
}