package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_JuegoMS;
import proyecto.Vistas.Vista_JuegoTF;
import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class JuegoMS_Controler implements ActionListener {

    private Vista_JuegoMS vista;
    private Dao_MS modelo;
    private Dao_User modeloUser;
    private MultipleSelection pregunta;
    
    public JuegoMS_Controler(Vista_JuegoMS vista, Dao_MS modelo, Dao_User modeloUser) {
        this.vista = vista;
        this.modelo = modelo;
        this.modeloUser = modeloUser;
        this.vista.jl_respuesta1.addActionListener(this);
        this.vista.jl_respuesta2.addActionListener(this);
        this.vista.jl_respuesta3.addActionListener(this);
        this.vista.jl_respuesta4.addActionListener(this);
        this.vista.jb_respond.addActionListener(this);
        this.vista.jb_respond.addActionListener(this);
        this.pregunta = modelo.getLista().getElemento();
        this.vista.jl_question.setText(pregunta.getQuestion());
        this.vista.jl_respuesta1.setText(pregunta.getmS_AnswerList().getElemento(0).getAnswer());
        this.vista.jl_respuesta2.setText(pregunta.getmS_AnswerList().getElemento(1).getAnswer());
        this.vista.jl_respuesta3.setText(pregunta.getmS_AnswerList().getElemento(2).getAnswer());
        this.vista.jl_respuesta4.setText(pregunta.getmS_AnswerList().getElemento(3).getAnswer());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jb_respond) {
            boolean correct1 = false;
            boolean correct2 = false;
            boolean correct3 = false;
            boolean correct4 = false;
            boolean correctAnswer1 = pregunta.getmS_AnswerList().getElemento(0).getCorrect();
            boolean correctAnswer2 = pregunta.getmS_AnswerList().getElemento(1).getCorrect();
            boolean correctAnswer3 = pregunta.getmS_AnswerList().getElemento(2).getCorrect();
            boolean correctAnswer4 = pregunta.getmS_AnswerList().getElemento(3).getCorrect();
            

            if (vista.jl_respuesta1.isSelected()) {
                correct1 = true;
            }
            if (vista.jl_respuesta2.isSelected()) {
                correct2 = true;
            }
            if (vista.jl_respuesta3.isSelected()) {
                correct3 = true;
            }
            if (vista.jl_respuesta4.isSelected()) {
                correct4 = true;
            }
            for (int i = 0; i < modeloUser.getLista().getTAMANO(); i++) {
                if (modeloUser.getLista().getElemento(i) != null) {;
                    String username = modeloUser.getLista().getElemento(i).getUsername();
                    String inputUsername = ClasePrueba.UserLogged;
                    if (username.equals(inputUsername)) {
                        if (correctAnswer1 == correct1 && correctAnswer2 == correct2 && correctAnswer3 == correct3 && correctAnswer4 == correct4) {
                            modeloUser.sumarPuntos(i);
                        }
                    }
                }
            }
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
