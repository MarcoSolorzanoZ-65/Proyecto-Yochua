package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.DAO.TF.Dao_TF;
import proyecto.Vistas.Vista_EditTF;
import proyecto.Vistas.Vista_TF;
import proyecto.sampleClasses.TrueOrFalse;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class TFEdit_Controler implements ActionListener {
    
    private Vista_EditTF vista;
    private Dao_TF modelo;
    private int index;

    public TFEdit_Controler(Vista_EditTF vista, Dao_TF modelo, int index) {
        this.vista = vista;
        this.modelo = modelo;
        this.index = index;
        this.vista.jRadioButton_True.addActionListener(this);
        this.vista.jRadioButton_False.addActionListener(this);
        this.vista.jB_Guardar.addActionListener(this);
        this.vista.jm_volver.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.jB_Guardar) {
            boolean tf = false;
            if (vista.jRadioButton_True.isSelected()) {
                tf = true;
            } else if (vista.jRadioButton_False.isSelected()) {
                tf = false;
            }
            modelo.edit(index, vista.jcb_TFC.getSelectedItem().toString(),vista.jTextField_Pregunta.getText(), tf);
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
            java.util.logging.Logger.getLogger(Vista_EditTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
