package proyecto.Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_Principal;
import proyecto.Vistas.Vista_Añadir;
import proyecto.Vistas.Vista_Mostrar;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.DAO.MS.Dao_MS;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Principal_Controler implements ActionListener {
    
    private Vista_Principal vista;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;
    
    public Principal_Controler(Vista_Principal vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.vista.jM_agregar.addActionListener(this);
        this.vista.jB_jugar.addActionListener(this);
        this.vista.jM_salir.addActionListener(this);
        this.vista.jM_mostrar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jB_jugar) {
            Vista_Juego vista_Juego = new Vista_Juego(vista, false);
            Juego_Controler jc = new Juego_Controler(vista_Juego, modelo, modelo2, modelo3);
            modelo.cargarDatosPrueba();
            jc.iniciarVista();
        }
        if (e.getSource() == vista.jM_salir) {
            System.exit(0);
        }
        if (e.getSource() == vista.jM_agregar) {
            Vista_Añadir vista_Añadir = new Vista_Añadir(vista, false);
            Añadir_Controler ac = new Añadir_Controler(vista_Añadir, modelo, modelo2, modelo3);
            modelo.cargarDatosPrueba();
            modelo2.cargarDatosPrueba();
            modelo3.cargarDatosPrueba();
            ac.iniciarVista();
        }
        if (e.getSource() == vista.jM_mostrar) {
            Vista_Mostrar vista_Mostrar = new Vista_Mostrar(vista, false);
            Mostrar_Controler mc = new Mostrar_Controler(vista_Mostrar, modelo, modelo2, modelo3);
            modelo.cargarDatosPrueba();
            modelo2.cargarDatosPrueba();
            modelo3.cargarDatosPrueba();
            mc.iniciarVista();
        }
    }
}
