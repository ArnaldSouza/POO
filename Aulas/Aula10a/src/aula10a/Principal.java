
package aula10a;

public class Principal {

        public static void main(String [ ] args){
               Principal principal = new Principal();
               principal.iniciar();
        }

        public void iniciar(){
                 Coelho  coelho = new Coelho();
                 coelho.andar();
                 System.out.println( coelho.temPelos() );
        }

}

