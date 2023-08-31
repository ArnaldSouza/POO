
package aula7b;

import java.util.ArrayList;

/**
 * TODO1: Classe Estudante: modifique a classe Estudante para que
 *         ela seja subclasse de MembroUniversitario.
 * TODO2: Classe Tecnico: modifique a classe Tecnico para que
 *         ela seja subclasse de MembroUniversitario.
 * TODO3: Classe Principal: instancie 3 (tres) Estudantes.
 * TODO4: Classe Principal: instancie 3 (tres) Tecnicos.
 * TODO5: Classe Principal: imprima o estado de execucao de cada objeto instanciado.
 */

public class Principal {
       
            
    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
    
    public void iniciar(){
        
        ArrayList<Estudante> lista = new ArrayList<>();
        ArrayList<Tecnico> lista2 = new ArrayList<>();
        
        Estudante Arnald = new Estudante("Arnald");
        Estudante Souza = new Estudante("Souza",14);
        Estudante Feitosa = new Estudante("Feitosa",54,"585.988.965-52");
        
        lista.add(Arnald);
        lista.add(Souza);
        lista.add(Feitosa);
        for(Estudante estudante: lista)
            System.out.println(estudante);
        
        Tecnico Luis = new Tecnico();
        Tecnico Mario = new Tecnico();
        Tecnico Leandro = new Tecnico();
        
        lista2.add(Luis);
        lista2.add(Mario);
        lista2.add(Leandro);
        for(Tecnico tecnico : lista2) 
            System.out.println(tecnico);
        
    }
}