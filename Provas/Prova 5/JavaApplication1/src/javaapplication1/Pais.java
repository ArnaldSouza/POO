
package javaapplication1;


public abstract class Pais {
   
    private String sigla;
    
    public void setSigla(String sigla ) {
	this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

	public abstract void imprimePaisrefSigla();
    
}
