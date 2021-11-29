package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.US.Dao_US;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_JuegoMS;
import proyecto.Vistas.Vista_JuegoUS;
import proyecto.sampleClasses.MultipleSelection;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class JuegoUS_Controler implements ActionListener {

    private Vista_JuegoUS vista;
    private Dao_US modelo;
    private Dao_User modeloUser;
    private UniqueSelection pregunta;

    public JuegoUS_Controler(Vista_JuegoUS vista, Dao_US modelo, Dao_User modeloUser) {
        this.vista = vista;
        this.modelo = modelo;
        this.modeloUser = modeloUser;
        pregunta = modelo.getLista().getElemento();
        this.vista.jb_respond.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        this.vista.jl_question.setText(pregunta.getQuestion());
        this.vista.jr_answer1.setText(pregunta.getAnswer());
        this.vista.jr_answer2.setText(pregunta.getIncAnswer1());
        this.vista.jr_answer3.setText(pregunta.getIncAnswer2());
        this.vista.jr_answer4.setText(pregunta.getIncAnswer3());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_respond) {
            String correct1 = "";

            if (vista.jr_answer1.isSelected()) {
                correct1 = vista.jr_answer1.getText();
            }

            boolean loggin = false;
            for (int i = 0; i < modeloUser.getLista().getTAMANO(); i++) {
                if (loggin == false) {
                    if (modeloUser.getLista().getElemento(i) != null) {
                        String username = modeloUser.getLista().getElemento(i).getUsername();
                        String inputUsername = ClasePrueba.UserLogged;
                        if (username.equals(inputUsername)) {
                            if (correct1.equals(pregunta.getAnswer())) {
                                modeloUser.sumarWins(i);
                                modeloUser.sumarWins_US(i);
                                loggin = true;
                                JOptionPane.showMessageDialog(null, "Respuesta Correcta");
                            } else {
                                JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
                                modeloUser.sumarLosses(i);
                                modeloUser.sumarLosses_US(i);
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
