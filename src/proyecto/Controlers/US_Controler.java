/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.DAO.US.Dao_US;
import proyecto.Vistas.Vista_US;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 19:16:59
 * @date 24 nov. 2021
 */
public class US_Controler implements ActionListener {

    private Vista_US vista;
    private Dao_US modelo;

    public US_Controler(Vista_US vista, Dao_US modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jB_Añadir.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
        }

        if (e.getSource() == vista.jB_Añadir) {
            String opcionCorrecta = "";
            String opcioIncorrecta1 = "";
            String opcioIncorrecta2 = "";
            String opcioIncorrecta3 = "";
            if (vista.jB_Opcion1.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion1.getText();
                opcioIncorrecta1 = vista.jTF_Opcion2.getText();
                opcioIncorrecta2 = vista.jTF_Opcion3.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();
            } else if (vista.jB_Opcion2.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion2.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion3.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();
            } else if (vista.jB_Opcion3.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion3.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion2.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();

            } else if (vista.jB_Opcion4.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion4.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion2.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();
            }

            modelo.insertar(new UniqueSelection(opcionCorrecta, opcioIncorrecta1, opcioIncorrecta2, opcioIncorrecta3, vista.jcb_USC.getSelectedItem().toString(), vista.jTextField_Pregunta.getText()));
            vista.dispose();
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_US.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
