
package aula13c;


public class CaixaEletronico {
    EmissorNotas emissorNotas;
    Painel painel;          
    public CaixaEletronico(){
        emissorNotas = new EmissorNotas();
        painel = new Painel();
    }
    
    private static class Painel{
       private int operacao;         
       public Painel(){
             operacao = 0;
         }

      
        public int getOperacao(){
            return operacao;
        }
    }
    
    private static class EmissorNotas{
    
        private float valor;
       public EmissorNotas(){
             valor = 0f;
        }
        public float valor(){
            return valor;
        }
    }
    
    public static void main(String [ ] args){
        CaixaEletronico caixaEletronico = new CaixaEletronico();
    }
}
