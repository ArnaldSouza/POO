package aula13b;

public class CaixaEletronico {        
        private Painel painel;
        private EmissorNotas emissorNotas;
        private Float valor;
        private int operacao;

        public CaixaEletronico(){
                painel = new Painel();
                emissorNotas = new EmissorNotas();
                this.valor = 15.0f;
                this.operacao = 2;
        }

        public class Painel{
              public int getOperacao(){
                      return operacao;
              }
        }

        public class EmissorNotas{
               public Float getNotas(){
                      return valor;
               }
        }

        public static void main(String[] args){
                CaixaEletronico caixaEletronico = new CaixaEletronico();
        }
}
