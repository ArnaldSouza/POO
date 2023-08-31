
package aula5b;

public class Principal {

    public Principal(){
        Estudante arnald = new Estudante();
        Estudante maria = new Estudante("MARIA",20);
        
        System.out.println(arnald.idade);
        System.out.println(arnald.getEndereco());
        
    }

    public static void main(String[] args) {
        new Principal();
    }
}

    

