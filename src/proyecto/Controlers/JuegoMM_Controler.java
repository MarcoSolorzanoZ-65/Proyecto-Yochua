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
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_MainMenuJuego;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class JuegoMM_Controler implements ActionListener {

    private Vista_MainMenuJuego vista;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;
    private Dao_User modelo4;

    public JuegoMM_Controler(Vista_MainMenuJuego vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3, Dao_User modelUser) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.modelo4 = modelUser;
        this.vista.jm_ins.addActionListener(this);
        this.vista.jm_volv.addActionListener(this);
        this.vista.jb_estad.addActionListener(this);
        this.vista.jb_jugar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jm_ins) {
            JOptionPane.showMessageDialog(null, "Instrucciones generales del juego de trivia:\n\nEl juego contiene preguntas de 3 niveles de dificultad:"
                    + "\n1) Facil: preguntas de True Or False.\n2) Medio: preguntas de Unique Selection(se necesita haber respondido 5 preguntas correctamente del nivel facil para avanzar a este nivel)."
                    + "\n3) Dificil: preguntas de Multiple Selection(se necesita haber respondido 5 preguntas del nivel medio correctamente para avanzar a este nivel."
                    + "\nEl juego por defecto consiste de 5 preguntas por categoria, por lo que son 15 preguntas en total por cada nivel de dificultad, sumando 45 preguntas en todo el juego."
                    + "\n\nEl boton de estadisticas despliega los datos de las partidas ganadas y perdidas del usuario.)");
        }

        if (e.getSource() == vista.jm_volv) {
            vista.dispose();
        }
        if (e.getSource() == vista.jb_estad) {
            for (int i = 0; i < modelo4.getLista().getTAMANO(); i++) {
                if (modelo4.getLista().getElemento(i) != null) {
                    if (modelo4.getLista().getElemento(i).getUsername().equals(ClasePrueba.UserLogged)) {
                        JOptionPane.showMessageDialog(null, "Usuario: " + modelo4.getLista().getElemento(i).getUsername()
                                + "\nWins Totales: " + modelo4.getLista().getElemento(i).getWins() + "\nWins Facil: " 
                                + modelo4.getLista().getElemento(i).getWins_TF() + "\nWins Medio: " 
                                + modelo4.getLista().getElemento(i).getWins_US() + "\nWins Dificil: " 
                                + modelo4.getLista().getElemento(i).getWins_MS() + "\nLosses Totales: " 
                                + modelo4.getLista().getElemento(i).getLosses() + "\nLosses Facil: "
                                + modelo4.getLista().getElemento(i).getLosses_TF() + "\nLosses Medio: "
                                + modelo4.getLista().getElemento(i).getLosses_US() + "\nLosses Dificil: "
                                + modelo4.getLista().getElemento(i).getLosses_MS());
                    }
                }
            }
        }
        if (e.getSource() == vista.jb_jugar) {
                Vista_Juego vista_Juego = new Vista_Juego(vista, false);
                Juego_Controler jc = new Juego_Controler(vista_Juego, modelo, modelo2, modelo3, modelo4);
                jc.iniciarVista();
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
