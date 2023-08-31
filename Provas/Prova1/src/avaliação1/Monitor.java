
package avaliação1;

public class Monitor extends Empregado{
    private String monitor;
    private float cargaHoraria;

    public Monitor(String monitor, float cargaHoraria, float salario) {
        super(salario);
        this.monitor = monitor;
        this.cargaHoraria = cargaHoraria;
    }  
  
    
    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    
    
}
