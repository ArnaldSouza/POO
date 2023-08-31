
package avaliacao1;


public class Coordenador extends Departamento_A {
    private int ID;
    private String curso;
    
    public Coordenador (){
        setID(0);
        setCurso("");
    }
    
    public Coordenador(int ID, String curso){
            setID(ID);
            setCurso(curso);
    }
       
    
    public int getID(){
          return this.ID;    }
    
    public void setID(int ID){
          this.ID = ID;
    } 
    
    
    public String getCurso(){
          return this.curso;    }
    
    public void setCurso(String curso){
          this.curso = curso;
    } 

}
