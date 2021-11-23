package proyecto;

import proyecto.Lists.TrueOrFalseList;
import proyecto.Vistas.Vista_Principal;
import proyecto.DAO.Dao_MC;
import proyecto.Controlers.Principal_Controler;
/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {

    public static TrueOrFalseList lista = new TrueOrFalseList();
    
    public static void main(String[] args) {
        
        Vista_Principal vista_Principal = new Vista_Principal();
        
        Dao_MC dao_MC = new Dao_MC();
        
        Principal_Controler principal_Controler = new Principal_Controler(vista_Principal, dao_MC);
        
        dao_MC.cargarDatosPrueba();
        
        principal_Controler.iniciarTrivia();
    }
}
