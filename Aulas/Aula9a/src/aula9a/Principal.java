package aula9a;

public class Principal {

    
    public static void main(String[] args) {
       
        Empresa bk = new Empresa();
        System.out.println(bk);
        
        MicroEmpresa x = new MicroEmpresa();
        System.out.println("Responsavel da micro empresa: "+x.getResponsavel());
        
        Cliente y2 = new Cliente("Ciclano");
        Floricultura y = new Floricultura();
        y.add(y2);
    }
    
}

