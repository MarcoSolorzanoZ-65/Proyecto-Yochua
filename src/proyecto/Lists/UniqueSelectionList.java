package proyecto.Lists;

import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:08 PM
 * @date Oct 21, 2021
 */
public class UniqueSelectionList {

    private UniqueSelection[] uniqueSelections;
    private int index = 0;
    private final static int TAMANO = 3;

    public UniqueSelectionList() {
        this.uniqueSelections = new UniqueSelection[TAMANO];
    }

    public UniqueSelectionList(UniqueSelection[] questionVector) {
        if (questionVector == null) {
            this.uniqueSelections = new UniqueSelection[TAMANO];
        } else {
            this.uniqueSelections = questionVector;
        }
    }

    public UniqueSelectionList(int size) {
        if (size < 0) {
            uniqueSelections = new UniqueSelection[TAMANO];
        } else {
            uniqueSelections = new UniqueSelection[size];
        }
    }

    public String getVectorString() {
        String text = "";
        for (UniqueSelection element : uniqueSelections) {
            if (element != null) {
                text += element + "\n";
            }
        }
        return text;
    }

    public void setUniqueSelection(String answer, String incAnswer1, String incAnswer2, String incAnswer3, String category, String Question) {
        uniqueSelections[index] = new UniqueSelection(answer, incAnswer1, incAnswer2, incAnswer3, category, Question);

        index++;
    }

    public String getQuestions() {
        String text = "";
        int cont = 1;
        for (int i = 0; i < 3; i++) {
            if (uniqueSelections[i].getQuestion() != null) {
                text += cont + ") " + uniqueSelections[i].getQuestion();
                cont++;
            }
        }
        return text;
    }
    
    public UniqueSelection getElemento() {
        int elementoRandom = (int) (Math.random() * index); 
        
        return uniqueSelections[elementoRandom]; // falta validaciones (null, etc.. )
    }
    
    public UniqueSelection getElemento(int index) {
        return uniqueSelections[index]; // falta validaciones (null, etc.. )
    }
    
    public void agregar(UniqueSelection e) {
        if (index < TAMANO) {
            uniqueSelections[index] = e;
            index++;
        }
    }
    
    public String getSpecificQuestion(int i) {
        return uniqueSelections[i].getQuestion();
    }

    public String getSpecificAnswer(int i) {
        return uniqueSelections[i].getAnswer();
    }
}
