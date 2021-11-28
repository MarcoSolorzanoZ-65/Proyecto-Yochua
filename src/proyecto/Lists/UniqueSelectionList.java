package proyecto.Lists;

import proyecto.sampleClasses.MultipleSelection;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:08 PM
 * @date Oct 21, 2021
 */
public class UniqueSelectionList {

    private UniqueSelection[] uniqueSelections;
    private int index = 0;
    private final int TAMANO = 5;

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
        String result = "";
        int contador = 1;
        for (int i = 0; i < uniqueSelections.length; i++) {
            if (uniqueSelections[i] != null) {
                result += (contador) + ")" + uniqueSelections[i].getQuestion() + "\n";
                contador++;
            }
        }
        return result;
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

    public void edit(int i, String answer, String category, String incAnswer1,
            String incAnswer2, String incAnswer3, String question) {
        uniqueSelections[i].setAnswer(answer);
        uniqueSelections[i].setCategory(category);
        uniqueSelections[i].setIncAnswer1(incAnswer1);
        uniqueSelections[i].setIncAnswer2(incAnswer2);
        uniqueSelections[i].setIncAnswer3(incAnswer3);
        uniqueSelections[i].setQuestion(question);
    }

    public UniqueSelection eliminar(int i) {
        uniqueSelections[i - 1] = null;
        orderByLastQuestionAscendingly();
        return uniqueSelections[i];
    }

    public int getTAMANO() {
        return TAMANO;
    }

    public void orderByLastQuestionAscendingly() {
        for (int i = 1; i < uniqueSelections.length; i++) {
            for (int j = 0; j < uniqueSelections.length - i; j++) {
                if (uniqueSelections[j] != null && uniqueSelections[j + 1] != null) {
                    if (uniqueSelections[j].getQuestion().compareTo(uniqueSelections[j + 1].getQuestion()) > 0) {
                        UniqueSelection aux = uniqueSelections[j];
                        uniqueSelections[j] = uniqueSelections[j + 1];
                        uniqueSelections[j + 1] = aux;
                    } else {
                        if (uniqueSelections[j].getQuestion().compareTo(uniqueSelections[j + 1].getQuestion()) == 0) {
                            if (uniqueSelections[j].getAnswer().compareTo(uniqueSelections[j + 1].getAnswer()) > 0) {
                                UniqueSelection aux = uniqueSelections[j];
                                uniqueSelections[j] = uniqueSelections[j + 1];
                                uniqueSelections[j + 1] = aux;
                            }

                        }

                    }
                }
            }
        }
    }

    public int getLenght() {
        return uniqueSelections.length;
    }
}
