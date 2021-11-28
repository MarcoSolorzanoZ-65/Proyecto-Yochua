package proyecto.Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto.Vistas.Vista_Juego;
import proyecto.Vistas.Vista_Principal;
import proyecto.Vistas.Vista_Añadir;
import proyecto.Vistas.Vista_Mostrar;
import proyecto.Vistas.Vista_Login;
import proyecto.Vistas.Vista_Registrar;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.Users.Dao_User;

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
    private Dao_User modelo4;
    
    public Principal_Controler(Vista_Principal vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3, Dao_User modelo4) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.modelo4 = modelo4;
        this.vista.jM_agregar.addActionListener(this);
        this.vista.jB_Jugar.addActionListener(this);
        this.vista.jM_salir.addActionListener(this);
        this.vista.jM_mostrar.addActionListener(this);
        this.vista.jB_Registrar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jB_Jugar) {
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
        
        if (e.getSource() == vista.jB_Registrar) {
            Vista_Registrar vista_Registrar = new Vista_Registrar(vista, false);
            Registrar_Controler rg = new Registrar_Controler(vista_Registrar, modelo4);
            modelo4.cargarDatosPrueba();
            rg.iniciarVista();
        }
        
        if (e.getSource() == vista.jB_Ingresar) {
            Vista_Login vista_Login = new Vista_Login(vista, false);
            Login_Controler lg = new Login_Controler(vista_Login,modelo4);
            modelo4.cargarDatosPrueba();
            lg.iniciarVista();
            
        }
        
    }
}
