package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.DAO.MS.Dao_MS;
import proyecto.Vistas.Vista_EditMS;
import proyecto.Vistas.Vista_MS;
import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class MSEdit_Controler implements ActionListener {

    private Vista_EditMS vista;
    private Dao_MS modelo;
    private int index;

    public MSEdit_Controler(Vista_EditMS vista, Dao_MS modelo3, int index) {
        this.vista = vista;
        this.modelo = modelo3;
        this.index = index;
        this.vista.jB_Guardar.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        String opcion1 = "";
        String opcion2 = "";
        String opcion3 = "";
        String opcion4 = "";
        Boolean correcto1 = false;
        Boolean correcto2 = false;
        Boolean correcto3 = false;
        Boolean correcto4 = false;

        if (e.getSource() == vista.jB_Guardar) {

            if (vista.jB_Opcion1.isSelected()) {
                correcto1 = true;
            }
            
            if (vista.jB_Opcion2.isSelected()) {
                correcto2 = true;
            }
            
            if (vista.jB_Opcion3.isSelected()) {
                correcto3 = true;
            }
            
            if (vista.jB_Opcion4.isSelected()) {
                correcto4 = true;
            }
            
            opcion1 = vista.jB_Opcion1.getText();
            opcion2 = vista.jB_Opcion2.getText();
            opcion3 = vista.jB_Opcion3.getText();
            opcion4 = vista.jB_Opcion4.getText();

            modelo.editar(index, vista.jTextField_Pregunta.getText(), vista.jcb_MSC.getSelectedItem().toString(), opcion1,
                    correcto1, opcion2, correcto2, opcion3, correcto3, opcion4, correcto4);
        }
    }
    

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
