
package aula13g;

public class CaixaEletronico {
    
    private Painel painel;
    private EmissorNotas emissorNotas;
    
    public CaixaEletronico(){
        painel = new Painel(){ //classe interna anonima
             public int getOperacao(){
                  return operacao;
            }
        };
    
    System.out.println( painel.getOperacao() );
    painel.imprimir();

        emissorNotas = new EmissorNotas(){ //classe interna anonima
            public float getNotas(){
                 return valor;
            }
        };
        System.out.println( emissorNotas.getNotas() );


        IPainel painel2 = new IPainel(){
               public int getOperacao(){
                       return operacao;
               }
               public void imprimir(){
                       System.out.println("CLASSE INTERNA");
               }
        };
        System.out.println(painel2.getOperacao() );
        painel2.imprimir();
    }
    
    public interface IPainel {
       final int operacao=20;
         public abstract int getOperacao();
         public abstract void imprimir();
    }


    public abstract class Painel{
        
        protected int operacao;
        
        public Painel(){
            operacao = 20;
        }               
        public abstract int getOperacao();
        public void imprimir(){
              System.out.println("CLASSE ABSTRATA");
        }
    }
    
    public abstract class EmissorNotas{
        
        protected float valor;
        
        public EmissorNotas(){
            valor = 0;
        }    
         public abstract float getNotas();  
     }

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
    }  
}




