
package avaliacao1;


public class Monitor extends Extensao {
    
    private String nome;
    private float cargaHoraria;
        
    public Monitor (){
        setNome("");
        setCargaHoraria(0.0f);
    }
    
    public Monitor(String nome, float cargaHoraria){
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }
      
    
        
    public String getNome(){
          return this.nome;    }
    
    public void setNome(String nome){
          this.nome = nome;
    }
    
    public float getCargaHoraria(){
          return this.cargaHoraria;    }
    
    public void setCargaHoraria(float cargaHoraria){
          this.cargaHoraria = cargaHoraria;
    }

    

}
