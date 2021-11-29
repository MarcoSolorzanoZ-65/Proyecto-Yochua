package proyecto.Controlers;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 23:01:04
 * @date 26 nov. 2021
 */
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_Login;
import proyecto.sampleClasses.User;
import proyecto.ClasePrueba;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.Vistas.Vista_MainMenuJuego;

public class Login_Controler implements ActionListener {

    private Vista_Login vista;
    private Dao_User modelo;
    private Dao_MS modelo1;
    private Dao_TF modelo2;
    private Dao_US modelo3;
    private boolean login = false;

    public Login_Controler(Vista_Login vista, Dao_User modelo, Dao_TF dao_TF, Dao_MS dao_MS, Dao_US dao_US) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo1 = dao_MS;
        this.modelo2 = dao_TF;
        this.modelo3 = dao_US;
        this.vista.jButton_Login.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButton_Login) {
            for (int i = 0; i < modelo.getLista().getTAMANO(); i++) {
                    if (modelo.getLista().getElemento(i) != null) {
                        String password = modelo.getLista().getElemento(i).getPassword();
                        String username = modelo.getLista().getElemento(i).getUsername();
                        String inputPassword = vista.jText_Password.getText();
                        String inputUsername = vista.jText_Username.getText();
                        if (password.equals(inputPassword) && username.equals(inputUsername)) {
                            login = true;
                            ClasePrueba.UserLogged = inputUsername;
                            ClasePrueba.UserLoggerIndex = i;
                        }
                    }
            }
            if (login == true) {
                JOptionPane.showMessageDialog(null, "Te has loggeado correctamente");
                vista.dispose();
                Vista_MainMenuJuego vmmj = new Vista_MainMenuJuego(vista, false);
                JuegoMM_Controler jmmc = new JuegoMM_Controler(vmmj, modelo2, modelo3, modelo1, modelo);
                jmmc.iniciarVista();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            }
        }
        
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
        }
    }

    public boolean getLogin() {
        return login;
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
