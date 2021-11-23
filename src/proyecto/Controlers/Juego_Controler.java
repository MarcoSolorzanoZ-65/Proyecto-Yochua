package proyecto.Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto.Vistas.Vista_Juego;
import proyecto.DAO.Dao_MC;
import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;
import proyecto.sampleClasses.MultipleSelection;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Juego_Controler implements ActionListener {

    private Vista_Juego vista;
    private Dao_MC modelo;

    public Juego_Controler(Vista_Juego vista, Dao_MC modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jb_mc.addActionListener(this);
        this.vista.jb_sc.addActionListener(this);
        this.vista.jb_tf.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_tf) {

        }

        if (e.getSource() == vista.jb_mc) {

            vista.dispose();
        }
        if (e.getSource() == vista.jb_sc) {

            vista.dispose();
        }
    }

    public void iniciarVista() {

        vista.setVisible(true);
    }
}
