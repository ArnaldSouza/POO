
package aula26d;


public class Principal {

    public interface IFruta{
        public float getPreco();
        public String getQRCode();
    }
    
    public class Abacate implements IFruta{

        public float getPreco() {
            return 1.15f;
        }
        
        public String getQRCode() {
            return "QR Abacate";
        }
        
    }
    
    public class Maca implements IFruta{

        public float getPreco() {
            return 2.3f;
        }
        
        public String getQRCode() {
            return "QR Maca";
        }
        
    }
    
    public void imprimir(IFruta fruta){
        System.out.println(fruta.getPreco());
        System.out.println(fruta.getQRCode());
    }
    
    public void iniciar(){        
        IFruta fruta = new Abacate();
        imprimir(fruta);   
        
        fruta = new Maca();
        imprimir(fruta);   
        
        
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
