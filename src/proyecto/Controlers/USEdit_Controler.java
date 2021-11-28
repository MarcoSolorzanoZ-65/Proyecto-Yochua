package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.DAO.US.Dao_US;
import proyecto.Vistas.Vista_EditUS;
import proyecto.Vistas.Vista_US;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class USEdit_Controler implements ActionListener {
    
    private Vista_EditUS vista;
    private Dao_US modelo;
    private int index;


    public USEdit_Controler(Vista_EditUS vista,Dao_US modelo, int index) {
        this.vista = vista;
        this.modelo = modelo;
        this.index = index;
        this.vista.jB_Guardar.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.jB_Guardar) {
            String opcionCorrecta = "";
            String opcioIncorrecta1 = "";
            String opcioIncorrecta2 = "";
            String opcioIncorrecta3 = "";
            if (vista.jB_Opcion1.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion1.getText();
                opcioIncorrecta1 = vista.jTF_Opcion2.getText();
                opcioIncorrecta2 = vista.jTF_Opcion3.getText();
                opcioIncorrecta3 = vista.jTF_Opcion3.getText();
            } else if (vista.jB_Opcion2.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion2.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion3.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();
            } else if (vista.jB_Opcion3.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion3.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion2.getText();
                opcioIncorrecta3 = vista.jTF_Opcion4.getText();
                
            } else if (vista.jB_Opcion4.isSelected()) {
                opcionCorrecta = vista.jTF_Opcion4.getText();
                opcioIncorrecta1 = vista.jTF_Opcion1.getText();
                opcioIncorrecta2 = vista.jTF_Opcion2.getText();
                opcioIncorrecta3 = vista.jTF_Opcion3.getText();
            }
            modelo.edit(index, opcionCorrecta, vista.jcb_USC.getSelectedItem().toString(), opcioIncorrecta1, opcioIncorrecta2, opcioIncorrecta3, vista.jTextField_Pregunta.getText());
            vista.dispose();
        } 
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_EditUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
