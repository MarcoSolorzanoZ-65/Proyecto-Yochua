package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
import proyecto.Vistas.Vista_JuegoUS;
import proyecto.sampleClasses.User;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Juego_Controler implements ActionListener {

    private Vista_Juego vista;
    private User usurioDatos;
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
        this.usurioDatos = modelo4.getLista().getElemento(ClasePrueba.UserLoggerIndex);
        this.vista.jb_mc.addActionListener(this);
        this.vista.jb_sc.addActionListener(this);
        this.vista.jb_tf.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_tf) {
            Vista_JuegoTF vista_JuegoTF = new Vista_JuegoTF(vista, false);
            JuegoTF_Controler jtfc = new JuegoTF_Controler(vista_JuegoTF, modelo, modelo4);
            jtfc.iniciarVista();
        }
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
        }
        if (e.getSource() == vista.jb_mc) {
            for (int i = 0; i < modelo4.getLista().getTAMANO(); i++) {
                if (modelo4.getLista().getElemento(i) != null) {
                    String username = modelo4.getLista().getElemento(i).getUsername();
                    String inputUsername = ClasePrueba.UserLogged;
                    if (username.equals(inputUsername)) {
                        if (usurioDatos.getWins_US() == 5) {
                            Vista_JuegoMS vista_JuegoMS = new Vista_JuegoMS(vista, false);
                            JuegoMS_Controler jtfc = new JuegoMS_Controler(vista_JuegoMS, modelo3, modelo4);
                            jtfc.iniciarVista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Debes tener al menos 5 wins en la dificultad medio para jugar esta dificultad");
                        }
                    }
                }
            }
        }
        if (e.getSource() == vista.jb_sc) {
            for (int i = 0; i < modelo4.getLista().getTAMANO(); i++) {
                if (modelo4.getLista().getElemento(i) != null) {
                    String username = modelo4.getLista().getElemento(i).getUsername();
                    String inputUsername = ClasePrueba.UserLogged;
                    if (username.equals(inputUsername)) {
                        if (usurioDatos.getWins_TF()== 5) {
                            Vista_JuegoUS vista_JuegoUS = new Vista_JuegoUS(vista, false);
                            JuegoUS_Controler jtfc = new JuegoUS_Controler(vista_JuegoUS, modelo2, modelo4);
                            jtfc.iniciarVista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Debes tener al menos 5 wins en la dificultad facil para jugar esta dificultad");
                        }
                    }
                }
            }
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
