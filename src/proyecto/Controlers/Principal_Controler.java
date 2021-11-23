package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_Principal;
import proyecto.DAO.Dao_MC;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Principal_Controler implements ActionListener {

    private Vista_Principal vista;
    private Dao_MC modelo;

    public Principal_Controler(Vista_Principal vista, Dao_MC modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.jM_agregar.addActionListener(this);
        this.vista.jM_jugar.addActionListener(this);
        this.vista.jM_salir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jM_jugar){
            Vista_Juego vista_Juego = new Vista_Juego(vista, false);
            Juego_Controler jc = new Juego_Controler(vista_Juego, modelo);
            modelo.cargarDatosPrueba();
            jc.iniciarVista();
        }
        if(e.getSource() == vista.jM_salir) {
            System.exit(0);
        }
    }
}
