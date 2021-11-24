package proyecto;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.icons.FlatAbstractIcon;
import javax.swing.UIManager;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Vistas.Vista_Principal;
import proyecto.DAO.TF.Dao_TF;
import proyecto.Controlers.Principal_Controler;
import proyecto.Lists.UniqueSelectionList;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.DAO.US.Dao_US;
import proyecto.Lists.MultipleSelectionList;
import proyecto.sampleClasses.UniqueSelection;
import proyecto.DAO.MS.Dao_MS;
import proyecto.sampleClasses.MultipleSelection;
/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {

    public static TrueOrFalseList lista_TFalseList = new TrueOrFalseList();
    public static UniqueSelectionList lista_UniqueSelectionList = new UniqueSelectionList();
    public static MultipleSelectionList lista_MultipleSelectionList = new MultipleSelectionList();
    
    public static void main(String[] args) {
        
        
        
        try { 
        UIManager.setLookAndFeel(new FlatDarkLaf()); 
        } catch(Exception ignored){}

        Vista_Principal vista_Principal = new Vista_Principal();
        
        Dao_TF dao_TF = new Dao_TF();
        Dao_US dao_US = new Dao_US();
        Dao_MS dao_MS = new Dao_MS();
        
        dao_TF.insertar(new TrueOrFalse(true, "Geografia", "Es la antartida fria?"));
        dao_TF.insertar(new TrueOrFalse(true, "Geografia", "Es el desierto del Sahara caliente?"));
        dao_TF.insertar(new TrueOrFalse(false, "Arte", "Es el color verde, azul?"));
        dao_US.insertar(new UniqueSelection("Alajuela", "Cartago", "Limon", "Guanacaste", "Geografia", "En que provincia queda la calle ancha?"));
        dao_US.insertar(new UniqueSelection("La liga", "Limon FC", "Joe Mama", "Saprissa", "Deportes", "Cual es el mejor equipo de Costa Rica?"));
        dao_US.insertar(new UniqueSelection("Canal 7", "Canal 11", "Canal 8", "Canal 24", "Entretenimiento", "En que canal se transmitia La Pension originalmente?"));
        dao_MS.insertar(new MultipleSelection("Lima", false, "Turquesa", false, "Azul", true, "Rojo", true, "Arte", "Cual de estos son colores primarios?"));
        dao_MS.insertar(new MultipleSelection("Femenino", true, "Masculino", true, "Lesbiano", false, "Transexual", false, "Cultura General", "Cuales de estos generos son reales?"));
        dao_MS.insertar(new MultipleSelection("Parce", false, "Pura vida", true, "Mae", true, "Joe", false, "Cultura General", "Cuales de estas palabras son costarricenses"));
        
        Principal_Controler principal_Controler = new Principal_Controler(vista_Principal, dao_TF, dao_US, dao_MS);
        

        
    }
}
