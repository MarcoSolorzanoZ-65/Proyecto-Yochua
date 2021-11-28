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
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.Vistas.Vista_MS;
import proyecto.Vistas.Vista_TF;
import proyecto.Vistas.Vista_US;
import proyecto.Vistas.Vista_Mostrar;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Mostrar_Controler implements ActionListener {

    private Vista_Mostrar vista;
    private Vista_TF vistaTF;
    private Vista_MS vistaMS;
    private Vista_US vistaUS;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;

    public Mostrar_Controler(Vista_Mostrar vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.vista.jButtonMS.addActionListener(this);
        this.vista.jButtonTF.addActionListener(this);
        this.vista.jButtonUS.addActionListener(this);
        this.vista.jB_Delete.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButtonTF) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo.getLista().getQuestions());
        }
        if (e.getSource() == vista.jButtonUS) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo2.getLista().getQuestions());
        }
        if (e.getSource() == vista.jButtonMS) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo3.getLista().getQuestions());
        }
        if (e.getSource() == vista.jB_Delete) {
            int index = Integer.parseInt(vista.jText_NumPregunta.getText());
            
            
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
