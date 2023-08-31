package ex3_lista1;

import java.util.Scanner;

public class Ex3_Lista1 {

	public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
	
            String tipo;
            String placa;
	            
            System.out.println("Insira o tipo do veiculo a cadastrar:");
            tipo = texto.nextLine();
            System.out.println("Insira a placa do veiculo a cadastrar:");
            placa = texto.nextLine();
	  
            int horas_entrada;
            int min_entrada;
            int horas_saida;
            int min_saida;
            int tempo_entrada;
            int tempo_saida;
				
            int dia;
            int mes;
            int ano;
		
            System.out.println("Insira a hora em que o veiculo entrou no estacionamento:(Exemplo: Se chegou as 12h04, digite '12')");
            horas_entrada = texto.nextInt();
            System.out.println("Insira o minuto em que o veiculo entrou no estacionamento:(Exemplo: Se chegou as 12h04, digite '4')");
            min_entrada = texto.nextInt();
		
            String horario_saida = horas_entrada+ "h"+ min_entrada;		
            horas_entrada = horas_entrada * 60;
            tempo_entrada = horas_entrada + min_entrada;

	
            System.out.println("Insira a hora em que o veiculo saiu do estacionamento:(Exemplo: Se saiu as 21h15, digite '21')");
            horas_saida = texto.nextInt();
            System.out.println("Insira o minuto em que o veiculo saiu do estacionamento:(Exemplo: Se chegou as 21h15, digite '15')");
            min_saida = texto.nextInt();
	
            String horario_entrada = horas_entrada+ "h"+ min_entrada;	
            horas_saida = horas_saida * 60;
            tempo_saida = horas_saida + min_saida;
	
            int tempo_estacionado = tempo_saida - tempo_entrada;

            Veiculo veiculo = new Veiculo(tipo,placa,horario_saida,horario_entrada,tempo_estacionado);
		
	//data	entrada
		System.out.println("Insira o dia em que o veiculo entrou:");
		dia = texto.nextInt();
		
		System.out.println("Insira o mês em que o veiculo entrou:");
		mes = texto.nextInt();
		
		System.out.println("Insira o ano em que o veiculo entrou:");
		ano = texto.nextInt();
		
	int verifica = 1;
		veiculo.setData(dia,mes,ano,verifica);
		
		//data entrada fim
		
		
	//data	saida
		System.out.println("Insira o dia em que o veiculo saiu :");
		dia = texto.nextInt();
				
		System.out.println("Insira o mês em que o veiculo saiu :");
		mes = texto.nextInt();
				
		System.out.println("Insira o ano em que o veiculo saiu :");
		ano = texto.nextInt();
				
		verifica = 0;
		veiculo.setData(dia,mes,ano,verifica);
				
	//data saida fim

		
	double valor = 0;
		
	if(veiculo.tempo >= 30 && veiculo.tempo <= 60) {
		valor = 10;
	}else {
		if(veiculo.tempo >60) {
			valor = 20;
		}
	}
	
	System.out.println("R$ "+ valor);	
	
	texto.close();
	}
}