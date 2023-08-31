
package prova3;


public abstract class Produto {

    private float valorProduto = 1.0f;
    private Imposto imposto = new Imposto();
    
    
    private float valorFinal = valorProduto + taxaNacional + taxaMunicipal + taxaEstadual;
    
    public abstract void imprimir();
    
}
