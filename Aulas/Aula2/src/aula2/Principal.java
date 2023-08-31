package aula2;

import java.util.Scanner;

public class Principal {
    
    //variavel de instancia = atributo
    private String nome;
    private String CPF;
    

    public Principal(){
        
        Estudante arnald = new Estudante();
        arnald.imprimir();
        
        
        //Utilize a classe Scanner para receber dois valores inteiros e:
        //imprimir a soma na tela
        /*Scanner objeto = new Scanner(System.in);
        
        System.out.println("Digite o valor 1:");
        int valor1 = objeto.nextInt();
        
        System.out.println("Digite o valor 2:");
        int valor2 = objeto.nextInt();
        int soma = valor1+valor2;
        
        System.out.println("O valor da soma é:" +soma);*/
        
        //setNome("Arnald");
        //setCPF("22.719.233-33");
        //imprimirNome(); 
        //imprimirCPF();
       
    }
    
    public static void main(String[] args) {        
        Principal objeto; //objeto é uma variável
                          //do tipo da classe
                          //declarou
        int var;          
        
        objeto = new Principal();
        
        Principal objeto2 = new Principal();
    }
    
    
    
    /*
    * TODO: 1) Crie um metodo toString que imprima 
    * "Ola 'Engenharia de Computacao'" com cada string em uma linha separada
    */

    public String toString(){
        System.out.println("Olá \n Engenharia\n de \n Computação \n");
        return "";
    }   
    
    
    
    /*
    * TODO: 2) Crie um metodo 'imprimir' que retorne 'SIM' se a string fornecida
    * eh igual a "Engenharia de Computacao" e retorne 'NAO' caso contrario.
    */
    
    public String imprimir(String entrada){
        if(entrada.equals("Engenharia de Computação"))
            return "SIM";
        else
            return "NÃO";
    }

    
    
    public void setNome(String nome){ //Metodo mutador
        this.nome = nome;
    }
    
    public String getNome(){ //Metodo acessor
        return this.nome;
    }
    
    public void setCPF(String CPF){ //Metodo mutador
        this.CPF = CPF;
    }
    
    public String getCPF(){ //Metodo acessor
        return this.CPF;
    }
    
    public void imprimirNome(){
        System.out.println(getNome());
    }
    
    public void imprimirCPF(){
        System.out.println(getCPF());
    } 
}