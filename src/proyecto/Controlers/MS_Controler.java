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
import proyecto.Vistas.Vista_MS;
import proyecto.DAO.MS.Dao_MS;
import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 19:16:39
 * @date 24 nov. 2021
 */
public class MS_Controler implements ActionListener {

    private Vista_MS vista;
    private Dao_MS modelo;

    public MS_Controler(Vista_MS vista, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo3;
        this.vista.jB_Añadir.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        String opcion1 = "";
        String opcion2 = "";
        String opcion3 = "";
        String opcion4 = "";
        Boolean correcto1 = false;
        Boolean correcto2 = false;
        Boolean correcto3 = false;
        Boolean correcto4 = false;

        if (e.getSource() == vista.jB_Añadir) {

            if (vista.jB_Opcion1.isSelected()) {
                correcto1 = true;
            }
            
            if (vista.jB_Opcion2.isSelected()) {
                correcto2 = true;
            }
            
            if (vista.jB_Opcion3.isSelected()) {
                correcto3 = true;
            }
            
            if (vista.jB_Opcion4.isSelected()) {
                correcto4 = true;
            }
            
            opcion1 = vista.jB_Opcion1.getText();
            opcion2 = vista.jB_Opcion2.getText();
            opcion3 = vista.jB_Opcion3.getText();
            opcion4 = vista.jB_Opcion4.getText();
            
            modelo.insertar(new MultipleSelection(opcion1, correcto1, opcion2, correcto2, opcion3, correcto3, opcion4, correcto4, 
                    vista.jcb_MSC.getSelectedItem().toString(), vista.jTextField_Pregunta.getText()));
        }
    }
    

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
