package proyecto.Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto.Vistas.Vista_Juego;
import proyecto.DAO.Dao_MC;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Juego_Controler implements ActionListener{

    private Vista_Juego vista; 
    private Dao_MC modelo;
    
    public Juego_Controler(Vista_Juego vista, Dao_MC modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jb_mc.addActionListener(this);
        this.vista.jB_Falso.addActionListener(this);
        iniciarVista();
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == vista.jB_verdadero){
            JOptionPane.showMessageDialog(vista, "La opcion seleccionada fue: verdadero");
            vista.dispose();
        }
        
        if (e.getSource() == vista.jB_Falso){
            JOptionPane.showMessageDialog(vista, "La opcion seleccionada fue: Falso");
            vista.dispose();
        }
    }
    
    public void iniciarVista(){  
        Pregunta p = modelo.generarPreguntaRandom();
        vista.jT_Enunciado.setText(p.getEnunciado());

        vista.setVisible(true);
    }
}
