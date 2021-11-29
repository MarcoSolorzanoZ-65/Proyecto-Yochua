package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.DAO.Users.Dao_User;
import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_JuegoTF;
import proyecto.sampleClasses.TrueOrFalse;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class JuegoTF_Controler implements ActionListener {

    private Vista_JuegoTF vista;
    private Dao_TF modelo;
    private Dao_User modeloUser;
    private TrueOrFalse pregunta;

    public JuegoTF_Controler(Vista_JuegoTF vista, Dao_TF modelo, Dao_User modeloUser) {
        this.vista = vista;
        this.modelo = modelo;
        this.modeloUser = modeloUser;
        this.pregunta = modelo.getLista().getElemento();
        this.vista.jr_respuesta2.addActionListener(this);
        this.vista.jr_respuesta1.addActionListener(this);
        this.vista.jb_respond.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        this.vista.lb_pregunta.setText(modelo.getLista().getElemento().getQuestion());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_respond) {
            boolean tf = false;
            boolean answer = pregunta.getAnswer();
            if (vista.jr_respuesta1.isSelected()) {
                tf = true;
            } else if (vista.jr_respuesta2.isSelected()) {
                tf = false;
            }
            boolean loggin = false;
            for (int i = 0; i < modeloUser.getLista().getTAMANO(); i++) {
                if (loggin == false) {
                    if (modeloUser.getLista().getElemento(i) != null) {
                        String username = modeloUser.getLista().getElemento(i).getUsername();
                        String inputUsername = ClasePrueba.UserLogged;
                        if (username.equals(inputUsername)) {
                            if (tf == answer) {
                                JOptionPane.showMessageDialog(null, "Respuesta Correcta");
                                modeloUser.sumarWins(i);
                                modeloUser.sumarWins_TF(i);
                            } else {
                                JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
                                modeloUser.sumarLosses(i);
                                modeloUser.sumarLosses_TF(i);
                            }
                        }
                    }
                }
            }
            vista.dispose();
        }
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
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
