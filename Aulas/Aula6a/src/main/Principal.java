
package main;

/**
 * TODO1: Classe Principal: Renomeie a classe Main para ter o mesmo nome do arquivo. (OK)
 * TODO2: Classe Principal: Instancie 3 (três) objetos da classe Estudante. 
 *         Cada objeto deve ser instanciado com um construtor diferente do anterior. (OK)
 * TODO3: Classe Estudante: crie um método 'imprimir' que retorne a idade do Estudante. (OK)
 * TODO4: Classe Estudante: crie um método sobrecarregado 'imprimir' que retorne 
 *         a idade e o nome do Estudante.
 * TODO5: Classe Estudante: crie um método sobrecarregado 'imprimir' que retorne 
 *         a idade e o nome e o CPF do Estudante.
 */

public class Principal {
        
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
    public void iniciar(){
       Estudante Arnald;
       Estudante Souza;
       Estudante Feitosa; 
       
       Arnald = new Estudante("Arnald");
       Souza = new Estudante("Souza", 35);
       Feitosa = new Estudante("Feitosa",14,"125.685.987-15"); 
       
       System.out.println(Arnald.imprimir(20));
       System.out.println(Souza.imprimir("Souza",48));
       System.out.println(Feitosa.imprimir("Feitosa",48,"585.254.894-52"));
    }
}
