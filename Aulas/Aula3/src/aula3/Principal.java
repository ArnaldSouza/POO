
    package aula3;

    public class Principal {

        public Principal(){
            Estudante arnald = new Estudante("Arnald", "Rua Maavdsavs, 23", "212");
            Estudante maria = new Estudante("Maria","Rua 36","310");
            Estudante luis = new Estudante("Luis","Rua 123","456");
            //arnald.setNome("Arnald");
            System.out.println(arnald);
            System.out.println(maria);
            System.out.println(luis);
        }    

        public static void main(String[] args) {
            Principal objeto ;
            objeto = new Principal();
        }

    }
