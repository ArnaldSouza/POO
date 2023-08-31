
package aula29a;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Principal {
    
    public void iniciar(){
        /*String string1 = JOptionPane.showInputDialog("Digite o numero 1:");
        
        String string2 = JOptionPane.showInputDialog("Digite o numero 2:");
        
        Float n1 = Float.parseFloat(string1);
        Float n2 = Float.parseFloat(string2);
        
        JOptionPane.showMessageDialog(null, "Soma:" + (n1+n2));*/
        
        InterfaceGrafica gui = InterfaceGrafica.iniciar();
        gui.setSize(200,300);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);
        
        JLabel rotulo1 = gui.getRotulo1();
        rotulo1.addMouseListener(
                new MouseAdapter(){
                    public void mouseEntered(MouseEvent e){
                        Toolkit.getDefaultToolkit().beep();
                    }
                    
                }
        );
        
        rotulo1.addMouseListener(
                 new MouseAdapter(){
                     public void mouseClicked(MouseEvent e){
                         System.out.println(rotulo1.getText());
                     }
                     
                 });
        
        JTextField campoTexto = gui.getCampoTexto();
        campoTexto.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println(campoTexto.getText());
                    }
                }
        );
        
        JButton botaoEnviar = gui.getBotaoEnviar();
        botaoEnviar.addActionListener(
                new ActionListener(){ //Interface Listener
                    public void actionPerformed(ActionEvent e){
                        NovaJanela novaJanela = NovaJanela.iniciar();
                        novaJanela.setSize(200,300);
                        novaJanela.setDefaultCloseOperation(2);
                        novaJanela.setVisible(true);
                    }   
                }
        );
       
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
    
}
