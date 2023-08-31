    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1;

public class Empregado extends SistemaGestaoAcademica {

    private float salario;
    private Coordenador coordenador;
    private Monitor monitor;
    
    
    public Empregado(){
            setSalario(0);
            setCoordenador("");
            setMonitor("");
    }
    
    public Empregado(Coordenador coordenador, Monitor monitor, float salario){
           setCoordenador(coordenador);
           setMonitor(monitor);
           setSalario( salario );
   }
    
    public float getSalario(){
          return this.salario;
    }   
    public void setSalario(float salario){
          this.salario = salario;
   }
    
    public Monitor getMonitor(){
          return this.monitor;
    }   
    public void setMonitor(Monitor monitor){
          this.monitor = monitor;
   }
    
    public float getCoordenador(){
          return this.coordenador;
    }   
    public void setCoordenador(Coordenador coordenador){
          this.coordenador = coordenador;
   }
   }
