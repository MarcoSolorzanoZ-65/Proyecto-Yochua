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
import javax.swing.UIManager;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_Login;
import proyecto.sampleClasses.User;

public class Login_Controler implements ActionListener {

    private Vista_Login vista;
    private Dao_User modelo;

    public Login_Controler(Vista_Login vista, Dao_User modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jButton_Login.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButton_Login) {

            modelo.insertar(new User(vista.jText_Username.getText(), vista.jText_Password.getText()));
        }
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
