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
import proyecto.DAO.TF.Dao_TF;
import proyecto.Vistas.Vista_TF;
import proyecto.sampleClasses.TrueOrFalse;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 19:17:19
 * @date 24 nov. 2021
 */
public class TF_Controler implements ActionListener {

    private Vista_TF vista;
    private Dao_TF modelo;

    public TF_Controler(Vista_TF vista, Dao_TF modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jRadioButton_True.addActionListener(this);
        this.vista.jRadioButton_False.addActionListener(this);
        this.vista.jB_Añadir.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
        }

        if (e.getSource() == vista.jB_Añadir) {
            boolean tf = false;
            if (vista.jRadioButton_True.isSelected()) {
                tf = true;
            } else if (vista.jRadioButton_False.isSelected()) {
                tf = false;
            }
            modelo.insertar(new TrueOrFalse(tf, vista.jcb_TFC.getSelectedItem().toString(), vista.jTextField_Pregunta.getText()));
            vista.dispose();
        }

    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_TF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
