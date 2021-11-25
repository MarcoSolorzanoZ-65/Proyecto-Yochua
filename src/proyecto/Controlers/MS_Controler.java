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
import proyecto.Vistas.Vista_MS;
import proyecto.DAO.MS.Dao_MS;
import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 19:16:39
 * @date 24 nov. 2021
 */
public class MS_Controler implements ActionListener{
    
    private Vista_MS vista;
    private Dao_MS modelo;

    public MS_Controler(Vista_MS vista, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo3;
        this.vista.jB_Añadir.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_tf) {
            TrueOrFalseList list_tf = ClasePrueba.lista_TFalseList;
            System.out.println(list_tf.getVectorString());
        }

        if (e.getSource() == vista.jb_mc) {
            MultipleSelectionList list_MS = ClasePrueba.lista_MultipleSelectionList;
            System.out.println(list_MS.getVectorString());
        }
        if (e.getSource() == vista.jb_sc) {
            UniqueSelectionList list_SC = ClasePrueba.lista_UniqueSelectionList;
            System.out.println(list_SC.getVectorString());
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
