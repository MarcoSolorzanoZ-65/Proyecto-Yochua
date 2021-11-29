package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.ClasePrueba;
import proyecto.Lists.UserList;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto.DAO.Users.Dao_User;
import proyecto.Vistas.Vista_Registrar;
import proyecto.sampleClasses.User;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Registrar_Controler implements ActionListener {

    private Vista_Registrar vista;
    private Dao_User modelo;

    public Registrar_Controler(Vista_Registrar vista, Dao_User modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jButton_Registrar.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jm_volver) {
            vista.dispose();
        }
        if (e.getSource() == vista.jButton_Registrar) {
            boolean caractPass = false;
            boolean caractUser = false;

            if (vista.jText_Password.getText().length() <= 10 && vista.jText_Password.getText().length() >= 3) {
                caractPass = true;
            }

            if (vista.jText_Username.getText().length() <= 10 && vista.jText_Username.getText().length() >= 3) {
                caractUser = true;
            }
            if (caractUser == false || caractPass == false) {
                JOptionPane.showMessageDialog(null, "Error: La contraseña o el usuario necesitan tener un minimo de 3 caracteres y un maximo de 10 caracteres");
            }
            if (caractUser == true && caractPass == true) {
                if (modelo.getLista().searchByName(vista.jText_Username.getText()) == false) {
                    modelo.insertar(new User(vista.jText_Username.getText(), vista.jText_Password.getText()));
                    vista.dispose();
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Este Usuario o contraseña ya existe.");
                }
            }
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
