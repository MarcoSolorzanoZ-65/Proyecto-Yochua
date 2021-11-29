package proyecto;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Vistas.Vista_Principal;
import proyecto.DAO.TF.Dao_TF;
import proyecto.Controlers.Principal_Controler;
import proyecto.Lists.UniqueSelectionList;
import proyecto.DAO.US.Dao_US;
import proyecto.Lists.MultipleSelectionList;
import proyecto.DAO.MS.Dao_MS;
import proyecto.Lists.UserList;
import proyecto.DAO.Users.Dao_User;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {

    public static TrueOrFalseList lista_TFalseList = new TrueOrFalseList();
    public static UniqueSelectionList lista_UniqueSelectionList = new UniqueSelectionList();
    public static MultipleSelectionList lista_MultipleSelectionList = new MultipleSelectionList();
    public static UserList lista_UserList = new UserList();
    public static String UserLogged = "";
    public static int UserLoggerIndex;
    
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ignored) {
        }

        Vista_Principal vista_Principal = new Vista_Principal();

        Dao_TF dao_TF = new Dao_TF();
        Dao_US dao_US = new Dao_US();
        Dao_MS dao_MS = new Dao_MS();
        Dao_User dao_User = new Dao_User();
        
        
        Principal_Controler principal_Controler = new Principal_Controler(vista_Principal, dao_TF, dao_US, dao_MS, dao_User);
        
        dao_MS.cargarDatosPrueba();
        dao_TF.cargarDatosPrueba();
        dao_US.cargarDatosPrueba();
        dao_User.cargarDatosPrueba();
        
    }
}
