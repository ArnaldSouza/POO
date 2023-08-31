/*------------------------
a) Equipe: Arnald Souza e Luis Mendes
b) Postagem anterior está correta.
c) Nova Interface: 
d) Entrada: 
   123456
   Saída: 
   Placa: 123456 Valor Pago: R$20,00
---------------------------*/

/*------------------------
a) Equipe: Arnald Souza / João Pedro Neigri Heleno

b) Não houve erros

c) Nova Interface: TipoVeiculo.
Descrição: Identifica o tipo de veiculo e gera tarifa.

d) Entrada:

Digite o numero da placa
123456
Digite o valor pago
30
Digite o tempo em minutos
200
Insira o tipo de veiculo:
caminhao

Saida:

Placa: 123456
Valor pago: R$30.0
Cancela liberada.
Tempo de permanencia: Pouco tempo em, só: 0h:20min
Tarifa ser paga pelo tipo de veiculo: R$15.0

---------------------------*/
package ex10interna;
import java.util.Scanner;


public class Ex10Interna {


public interface InterfaceBilhete{
public abstract void pagar(float valor);
}

public interface InterfaceCancela{
public abstract String liberarVeiculo();
}

public interface InterfaceTempo{
public abstract void TempoDePermanencia(int tempo);
}

public interface InterfaceTipoVeiculo{
public abstract void tipoVeiculo(String tipo);
}


public class Veiculo implements InterfaceBilhete , InterfaceCancela, InterfaceTempo, InterfaceTipoVeiculo {
private String placa;
private float valor;
private int tempo;
private float valorVeiculo;


public Veiculo(String placa) {
this.placa = placa;
}

public Veiculo(String placa, float valor,int tempo, String tipo) {
this.placa = placa;
pagar(valor);
TempoDePermanencia(tempo);
tipoVeiculo(tipo);
}

public void pagar(float valor){
this.valor = valor;
}

public void TempoDePermanencia(int tempo){
this.tempo=tempo;
}

public String liberarVeiculo(){
if (this.valor > 0)
return "Cancela liberada.";
else
return "Cancela bloqueada.";
}

public String TempoDePermanencia(){

if(this.tempo < 60)
return "Pouco tempo em, só: " + ((this.tempo/60+"h")+":"+(this.tempo%60)+"min");

if ((this.tempo >= 60) && (this.tempo <= 180))
return "Tempo mediano: "+ ((this.tempo/60+"h")+":"+(this.tempo%60)+"min");

if (this.tempo > 180)
return "Ih o carro vai dormir aqui é ?: "+ ((this.tempo/60+"h")+":"+(this.tempo%60)+"min");

else
return "Tempo invalido";


}
//s1.equals(s2)
public void tipoVeiculo(String tipo){
if(tipo.equals("moto")){
this.valorVeiculo = 5.00f;
}else if(tipo.equals("carro")){
this.valorVeiculo = 10.00f;
}else{//caminhão
this.valorVeiculo = 15.00f;
}
}

public String toString(){
return "Placa: " + this.placa +
"\nValor pago: R$" + this.valor +
"\n" + liberarVeiculo()+
"\nTempo de permanencia: "+ TempoDePermanencia()+
"\nTarifa ser paga pelo tipo de veiculo: R$" + this.valorVeiculo;
}

}


public Ex10Interna(){
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o numero da placa: ");
String placa = entrada.next();

System.out.println("Digite o valor pago: ");
float valor = entrada.nextFloat();

System.out.println("Digite o tempo em minutos: ");
int tempo = entrada.nextInt();

System.out.println("Insira o tipo de veiculo: ");
String tipoVeiculo = entrada.next();

Veiculo et = new Veiculo(placa, valor,tempo, tipoVeiculo);
System.out.println(et);
}

public static void main(String[] args) {
new Ex10Interna();

}

}
