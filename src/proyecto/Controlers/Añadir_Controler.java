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
import proyecto.Vistas.Vista_MS;
import proyecto.Vistas.Vista_TF;
import proyecto.Vistas.Vista_US;


/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Añadir_Controler implements  ActionListener{
    
    private Vista_Añadir vista;
    private Vista_TF vistaTF;
    private Vista_MS vistaMS;
    private Vista_US vistaUS;
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
        this.vista.jm_volver.addActionListener(this);
        iniciarVista();
    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButton_ATF) {
            vista.dispose();
        }
        if (e.getSource() == vista.jButton_ATF) {
            Vista_TF vista_TF = new Vista_TF(vistaTF, false);
            TF_Controler ctf = new TF_Controler(vista_TF, modelo);
        }
        if (e.getSource() == vista.jButton_AMS) {
            Vista_MS vista_MS = new Vista_MS(vistaMS, false);
            MS_Controler cms = new MS_Controler(vista_MS, modelo3);
        }
        if (e.getSource() == vista.jButton_AUS) {
            Vista_US vista_US = new Vista_US(vistaUS, false);
            US_Controler cus = new US_Controler(vista_US, modelo2);
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
    
}
