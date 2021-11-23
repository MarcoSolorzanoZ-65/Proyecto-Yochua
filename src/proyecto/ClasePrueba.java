package proyecto;

import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {

    public static MultipleSelectionList lista = new MultipleSelectionList();
    
    public static void main(String[] args) {
        
        TrueOrFalseList trueOrFalseList = new TrueOrFalseList();
        Maintenance maintenance = new Maintenance();
        
        maintenance.menuQuestions();
    }
}
