package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.Vistas.Vista_Juego;
import proyecto.DAO.TF.Dao_TF;
import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;
import proyecto.Vistas.Vista_Principal;
import proyecto.sampleClasses.MultipleSelection;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.sampleClasses.UniqueSelection;
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.US.Dao_US;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Juego_Controler implements ActionListener {

    private Vista_Juego vista;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;
    
    public Juego_Controler(Vista_Juego vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.vista.jb_mc.addActionListener(this);
        this.vista.jb_sc.addActionListener(this);
        this.vista.jb_tf.addActionListener(this);
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
            java.util.logging.Logger.getLogger(Vista_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
