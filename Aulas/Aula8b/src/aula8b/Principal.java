package aula8b;

public class Principal {

         public Principal(){
              
                   Conta conta = new Conta(123, 10000f);
                   Estudante arnald = new Estudante( "Arnald", "Rua 123", conta );
                   arnald.getConta().deposito(50000f);
                   Banco banco = new Banco();
                   banco.add(arnald);


        }

         public static void main( String [ ] args ){
                   Principal principal = new Principal();
         }


}


