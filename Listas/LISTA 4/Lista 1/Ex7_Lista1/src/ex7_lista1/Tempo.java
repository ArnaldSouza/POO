/*
  Classe referente ao exercicio 8
  Essa classe calculo o tempo necessário para finalizar todos os processos de oscilação,
  o tempo necessário para realizar uma oscilação é coletado do usuário
 */

package ex7_lista1;

public class Tempo {

	int h;
	int m;
	int s;

        public void calculo(int oscilacoes, int tempo) {

        int tempo_total = oscilacoes * tempo;

        this.h = tempo_total / 3600;

        int aux = tempo_total % 3600;
        this.m = aux / 60;

        this.s = aux % 60;



	}	

}