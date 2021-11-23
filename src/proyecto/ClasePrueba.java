package proyecto;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.icons.FlatAbstractIcon;
import javax.swing.UIManager;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Vistas.Vista_Principal;
import proyecto.DAO.Dao_MC;
import proyecto.Controlers.Principal_Controler;
import proyecto.sampleClasses.TrueOrFalse;
/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {

    public static TrueOrFalseList lista = new TrueOrFalseList();
    
    public static void main(String[] args) {
        
        
        
        try { 
        UIManager.setLookAndFeel(new FlatDarkLaf()); 
        } catch(Exception ignored){}

        Vista_Principal vista_Principal = new Vista_Principal();
        
        Dao_MC dao_MC = new Dao_MC();
        
        dao_MC.insertar(new TrueOrFalse(true, "other", "Joe mama's lama?"));
        dao_MC.insertar(new TrueOrFalse(true, "other", "Joe mama is gay?"));
        dao_MC.insertar(new TrueOrFalse(true, "other", "David es gay??"));
        
        Principal_Controler principal_Controler = new Principal_Controler(vista_Principal, dao_MC);
        

        
    }
}
