
package exercício10;


/*------------------------
a) Equipe: Arnald Souza
b) Design Pattern: Template
---------------------------*/

import java.util.Scanner;

public class Principal {

    public interface IRestaurante {        
        public abstract String imprimir();
    }
    
    public abstract class ARestaurante implements IRestaurante{
        
        public ARestaurante(){
            imprimirRestaurante();
        }
        
        public void imprimirRestaurante(){
            System.out.println(this.imprimir());
        }
        public abstract boolean lerSaldo();
        public abstract boolean lerCracha();
        public abstract boolean prepararRefeicao();
        public abstract float getSaldo();
        public abstract int getCracha();    
    }

    public class Restaurante extends ARestaurante {
        private float saldo;
        private int cracha;

        public Restaurante(float saldo, int cracha) {
            this.saldo = saldo;
            this.cracha = cracha;
        }

        public boolean prepararRefeicao() {
            return true;
        }        

        public boolean lerSaldo() {
            boolean result = false;
            if (this.saldo > 3.5) {
                result = true;
            }
            return result;
        }

        public boolean lerCracha() {
            boolean result = false;
            if (this.cracha > 0) {
                result = true;
            }
            return result;
        }
        
        public float getSaldo() {            
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        
        public int getCracha() {
            return cracha;
        }
        
        public void setCracha(int cracha) {
            this.cracha = cracha;
        }
        
        public String imprimir(){
           return "Saldo: " + this.saldo +
                  "\nCracha: "  + this.cracha +
                  "\nRefeicao: " + this.prepararRefeicao();
        }
    }
     
    
    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ler saldo:");
        float saldo = entrada.nextFloat();

        System.out.print("Ler cracha:");
        int cracha = entrada.nextInt();

        Restaurante RU = new Restaurante(saldo, cracha);

        boolean v1 = RU.prepararRefeicao();
        boolean v2 = RU.lerSaldo();
        boolean v3 = RU.lerCracha();

        if (v1 && v2 && v3) {
            System.out.println("Acesso autorizado.");
        } else {
            System.out.println("Acesso não-autorizado.");
        }
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.iniciar();
    }
}

