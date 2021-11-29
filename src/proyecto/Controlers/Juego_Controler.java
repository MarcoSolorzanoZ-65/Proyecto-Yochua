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
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.US.Dao_US;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_JuegoMS;
import proyecto.Vistas.Vista_JuegoTF;

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
    private Dao_User modelo4;

    public Juego_Controler(Vista_Juego vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3, Dao_User modelUser) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.modelo4 = modelUser;
        this.vista.jb_mc.addActionListener(this);
        this.vista.jb_sc.addActionListener(this);
        this.vista.jb_tf.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_tf) {
            Vista_JuegoTF vista_JuegoTF = new Vista_JuegoTF(vista, false);
            JuegoTF_Controler jtfc = new JuegoTF_Controler(vista_JuegoTF, modelo, modelo4);
            jtfc.iniciarVista();
        }

        if (e.getSource() == vista.jb_mc) {
            Vista_JuegoMS vjms = new Vista_JuegoMS(vista, false);
            JuegoMS_Controler jmsc = new JuegoMS_Controler(vjms, modelo3, modelo4);
            jmsc.iniciarVista();
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
