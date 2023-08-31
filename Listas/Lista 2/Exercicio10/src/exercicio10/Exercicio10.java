package exercicio10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio10 {
    public interface IRestaurante {

        public abstract void lerSaldo();
        public abstract void pagamento();
        public abstract float menu();        
      
    }

    public class Restaurante implements IRestaurante {

        private float tesouraria;
        private ArrayList<Alimento> alimentos;

        /* Inicializa os objetos e membros iniciais*/
        public Restaurante() {
            alimentos = new ArrayList<>();
            Alimento alimento = new Alimento("Almoco", 3.5f);
            this.alimentos.add(alimento);

            alimento = new Alimento("Assados", 5.0f);
            this.alimentos.add(alimento);

            alimento = new Alimento("Fritos", 4.50f);
            this.alimentos.add(alimento);
            
            alimento = new Alimento("Frutas", 2.50f);
            this.alimentos.add(alimento);
            
            alimento = new Alimento("Sobremesa", 0.5f);
            this.tesouraria = 0f;
        }

        //Imprime quanto de dinheiro o restaurante tem.
        public void lerSaldo() {
            System.out.println("\nSaldo: " + this.tesouraria);
        }
        //Faz um pagamento que alguém comprar.

        public void pagamento() {
            Alimento compra = alimentos.get(0);
            float valorParaPagar = menu();
            float valorPago;
            Scanner entrada = new Scanner(System.in);
            
            do{
                System.out.println("Valor para pagar: " + valorParaPagar);
                System.out.print("\nQuanto foi pago: ");
                valorPago = entrada.nextFloat();
                
                if (valorPago - valorParaPagar < 0) {
                    System.err.println("ERRO: valor pago abaixo do preco! Tente novamente: ");
                }
            }while(valorPago - valorParaPagar < 0);
            
            this.tesouraria = +valorParaPagar;

            System.out.println("Troco: " + (valorPago - valorParaPagar)
                    + "\nTesouraria atual: " + this.tesouraria);
        }

        public float menu() {
            System.out.println("--------- Cardapio -------\nSelecione o que deseja:\n"
                    + "1 - Almoco\n2 - Assados\n3 - Fritos\n4 - Frutas\n5 - Sobremesa \n0 - Pagamento\n\n"
                    + "Digite: ");
            float total = 0;
            Scanner entrada = new Scanner(System.in);
            try{
                int op = 0;

                do {
                    op = entrada.nextInt();
                    
                    switch (op) {
                        case 1:
                            total += getPreco("Almoco");
                            break;
                        case 2:
                            total += getPreco("Assados");
                            break;
                        case 3:
                            total += getPreco("Fritos");
                            break;
                        case 4:
                            total += getPreco("Frutas");
                        case 5:
                            total += getPreco("Sobremesa");
                        case 0:
                            break;
                        default:
                            System.out.println("Opcao invalida! Tente novamente: ");
                            break;
                    }

                } while (op != 0);

            }catch(InputMismatchException ex){//tratamento se menu não recebe um inteiro
                System.out.println("Voce nao digitou um numero inteiro valido\n");
                System.out.println("Encerramento do programa");
                System.exit(0);
            }
        
            return total;

        }//menu(): mostra as opcoes de alimentos e retorna o total das opcoes escolhidas            

        public float getPreco(String alimento){

            for (Alimento ali : alimentos){
                if (ali.nome == alimento){
                    return ali.preco;
                }
            }
            return 0f;
        }//getPreco(): pega o preco de cada alimento na lista alimentos
    }

    public class Alimento {

        public String nome;
        public float preco;

        public Alimento(String nome, float preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    public void iniciar() {
        IRestaurante RU = new Restaurante();
        RU.lerSaldo();
        RU.pagamento();
    }

    public static void main(String[] args) {
        Exercicio10 ex10 = new Exercicio10();
        ex10.iniciar();
    }
}

