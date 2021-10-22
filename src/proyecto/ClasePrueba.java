package proyecto;

import proyecto.Lists.TrueOrFalseList;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:31:18 PM
 * @date Oct 20, 2021
 */
public class ClasePrueba {
    public static void main(String[] args) {
        TrueOrFalseList trueOrFalseList = new TrueOrFalseList();
        
        
        trueOrFalseList.setTrueOrFalse(0, "?", "Deportes", "Si", "SiNo");
        trueOrFalseList.setTrueOrFalse(1, "?", "Deportes", "Si", "SiNo");
        trueOrFalseList.setTrueOrFalse(2, "?", "Deportes", "Si", "SiNo");
        
        
        
        System.out.println(trueOrFalseList.getAnswers());
    }
}