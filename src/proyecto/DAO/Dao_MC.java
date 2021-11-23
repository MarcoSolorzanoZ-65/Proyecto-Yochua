package proyecto.DAO;

import proyecto.Lists.TrueOrFalseList;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.ClasePrueba;
/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Dao_MC {
    TrueOrFalseList list = ClasePrueba.lista; // atributo statico de la lista de preguntas
       
    public boolean insertar(Boolean answer, String category, String Question) {
        list.setTrueOrFalse(Question, category, answer);
        return true;
    }

    public TrueOrFalse generarPreguntaRandom(){
        TrueOrFalse p = list.getElemento();
        return p;
    }
    
    public void cargarDatosPrueba(){ // se agregar datos de prueba
        insertar(true, "others", "Es joe mama?");
        insertar(true, "others", "Es joe granny?");
        insertar(true, "others", "Es joe daddy?");    
    }
}
