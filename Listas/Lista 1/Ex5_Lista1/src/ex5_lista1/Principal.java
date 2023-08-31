package ex5_lista1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
            Scanner texto = new Scanner(System.in);	
            Descobrir n = new Descobrir();	
            Tentativas t = new Tentativas();

            n.gerador();

            System.out.println("Número aleatório em posição!");
            System.out.println("Chute um valor:");


            int correto = 0;

            while(correto != 1) {
                    int aposta = texto.nextInt();
                    correto = n.verificador(aposta,t);
                    t.quant_tentativas();
            }

            System.out.println("Você acertou, o número é "+n.num);
            t.getTentativas(t);

            texto.close();
		}
	}