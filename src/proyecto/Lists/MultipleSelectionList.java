package proyecto.Lists;

import proyecto.sampleClasses.MultipleSelection;
import proyecto.sampleClasses.TrueOrFalse;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:39 PM
 * @date Oct 21, 2021
 */
public class MultipleSelectionList {

    private MultipleSelection[] multipleSelectionList;
    private int index = 0;
    private final int TAMANO = 5;

    public MultipleSelectionList() {
        this.multipleSelectionList = new MultipleSelection[TAMANO];
    }

    public MultipleSelectionList(MultipleSelection[] questionVector) {
        if (questionVector == null) {
            this.multipleSelectionList = new MultipleSelection[TAMANO];
        } else {
            this.multipleSelectionList = questionVector;
        }
    }

    public MultipleSelectionList(int size) {
        if (size < 0) {
            multipleSelectionList = new MultipleSelection[TAMANO];
        } else {
            multipleSelectionList = new MultipleSelection[size];
        }
    }

    public String getVectorString() {
        String text = "";
        for (MultipleSelection element : multipleSelectionList) {
            if (element != null) {
                text += element + "\n";
            }
        }
        return text;
    }

    public String getQuestions() {
        String result = "";
        int contador = 1;
        for (int i = 0; i < multipleSelectionList.length; i++) {
            if (multipleSelectionList[i] != null) {
                result += (contador) + ")" + multipleSelectionList[i].getQuestion() + "\n";
                contador++;
            }
        }
        return result;
    }

    public void setMultipleSelection(String answer1, boolean correct1, String answer2, boolean correct2,
            String answer3, boolean correct3, String answer4, boolean correct4, String category,
            String Question) {

        multipleSelectionList[index] = new MultipleSelection(answer1, correct1, answer2, correct2,
                answer3, correct3, answer4, correct4, category, Question);

        index++;
    }

    public MultipleSelection getElemento(int index) {
        return multipleSelectionList[index]; // falta validaciones (null, etc.. )
    }

    public void agregar(MultipleSelection e) {
        if (index < TAMANO) {
            multipleSelectionList[index] = e;
            index++;
        }
    }

    public MultipleSelection eliminar(int i) {
        multipleSelectionList[i - 1] = null;
        orderByLastQuestionAscendingly();
        return multipleSelectionList[i];
    }

    public String getSpecificQuestion(int i) {
        return multipleSelectionList[i].getQuestion();
    }

    public MultipleSelection getElemento() {
        int elementoRandom = (int) (Math.random() * index);

        return multipleSelectionList[elementoRandom]; // falta validaciones (null, etc.. )
    }

    public int getTAMANO() {
        return TAMANO;
    }
    
    public void edit(int i, String question, String category, String answer1, boolean correct1 ,String answer2, boolean correct2,
            String answer3,  boolean correct3,  String answer4, boolean correct4) {
        multipleSelectionList[i].setCategory(category);
        multipleSelectionList[i].setQuestion(question);
        multipleSelectionList[i].getmS_AnswerList().setSpecificAnswer(1, answer1, correct1);
        multipleSelectionList[i].getmS_AnswerList().setSpecificAnswer(2, answer2, correct2);
        multipleSelectionList[i].getmS_AnswerList().setSpecificAnswer(3, answer3, correct3);
        multipleSelectionList[i].getmS_AnswerList().setSpecificAnswer(4, answer4, correct4);
        
    }
    
    public void orderByLastQuestionAscendingly() {
        for (int i = 1; i < multipleSelectionList.length; i++) {
            for (int j = 0; j < multipleSelectionList.length - i; j++) {
                if (multipleSelectionList[j] != null && multipleSelectionList[j + 1] != null) {
                    if (multipleSelectionList[j].getQuestion().compareTo(multipleSelectionList[j + 1].getQuestion()) > 0) {
                        MultipleSelection aux = multipleSelectionList[j];
                        multipleSelectionList[j] = multipleSelectionList[j + 1];
                        multipleSelectionList[j + 1] = aux;
                    } else {
                        if (multipleSelectionList[j].getQuestion().compareTo(multipleSelectionList[j + 1].getQuestion()) == 0) {
                            if (multipleSelectionList[j].getmS_AnswerList().getSpecificAnswer(0).compareTo(multipleSelectionList[j + 1]
                                    .getmS_AnswerList().getSpecificAnswer(0)) > 0) {
                                MultipleSelection aux = multipleSelectionList[j];
                                multipleSelectionList[j] = multipleSelectionList[j + 1];
                                multipleSelectionList[j + 1] = aux;
                            }

                        }

                    }
                }
            }
        }
    }
    public int getLenght() {
        return multipleSelectionList.length;
    }
}
