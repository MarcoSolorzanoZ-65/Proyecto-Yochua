package proyecto.DAO;

import proyecto.Lists.MultipleSelectionList;
import proyecto.sampleClasses.MultipleSelection;
import proyecto.ClasePrueba;
/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Dao_MC {
    MultipleSelectionList list = ClasePrueba.lista; // atributo statico de la lista de preguntas
       
    public boolean insertar(String question, String category, String answer1, String answer2, String answer3,
            String answer4, int correctAnswer1, int correctAnswer2, int correctAnswer3, int correctAnswer4){
        list.setMultipleSelection(question, category, answer1, answer2, answer3,
            answer4, correctAnswer1, correctAnswer2, correctAnswer3, correctAnswer4);
        return true;
    }

    public MultipleSelection generarPreguntaRandom(){
        MultipleSelection p = list.getElemento();
        return p;
    }
    
    public void cargarDatosPrueba(){ // se agregar datos de prueba
        insertar("Eres feo?", "others", "Si", "No", "Tal vez", "Creo", 1, 2, 3, 4);
        insertar("Eres feo?", "others", "Si", "No", "Tal vez", "Creo", 1, 2, 3, 4);
        insertar("Eres feo?", "others", "Si", "No", "Tal vez", "Creo", 1, 2, 3, 4);    
    }
}
