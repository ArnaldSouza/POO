/* classe referente ao exercício 2 
   calcula o tempo de execução do programa
*/


package ex1_lista1;


public class Time {
    
    long initial_time;
    long final_time;
    long total_time;
    
    public void setInitialTime(long time){
        this.initial_time = time;
    }
    
    public void setFinalTime(long time){
        this.final_time = time;
    }
    
    public Time setTotalTime(){
        this.total_time = this.final_time - this.initial_time;
        return this;
    }
    
    public Time getTotalTime(){
        System.out.println("O tempo de execução total do programa em milisegundos é:" +this.total_time +" ms" );
        return this;
    }
}
