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
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;
import proyecto.Vistas.Vista_Añadir;
import proyecto.Vistas.Vista_Juego;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Añadir_Controler implements  ActionListener{
    
    private Vista_Añadir vista;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;

    public Añadir_Controler(Vista_Añadir vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.vista.jButton_AMS.addActionListener(this);
        this.vista.jButton_ATF.addActionListener(this);
        this.vista.jButton_AUS.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButton_ATF) {
            TrueOrFalseList list_tf = ClasePrueba.lista_TFalseList;
            System.out.println(list_tf.getVectorString());
        }

        if (e.getSource() == vista.jButton_AMS) {
            MultipleSelectionList list_MS = ClasePrueba.lista_MultipleSelectionList;
            System.out.println(list_MS.getVectorString());
        }
        if (e.getSource() == vista.jButton_AUS) {
            UniqueSelectionList list_SC = ClasePrueba.lista_UniqueSelectionList;
            System.out.println(list_SC.getVectorString());
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
    
}
