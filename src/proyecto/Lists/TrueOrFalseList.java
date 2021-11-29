package proyecto.Lists;

import proyecto.sampleClasses.TrueOrFalse;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:06:17 PM
 * @date Oct 21, 2021
 */
public class TrueOrFalseList {

    private TrueOrFalse[] trueOrFalse;
    private int index = 0;
    public int TAMANO = 15;

    public TrueOrFalseList() {
        this.trueOrFalse = new TrueOrFalse[TAMANO];
    }

    public TrueOrFalseList(TrueOrFalse[] questionVector) {
        if (questionVector == null) {
            this.trueOrFalse = new TrueOrFalse[TAMANO];
        } else {
            this.trueOrFalse = questionVector;
        }
    }

    public TrueOrFalseList(int size) {
        if (size < 0) {
            trueOrFalse = new TrueOrFalse[TAMANO];
        } else {
            trueOrFalse = new TrueOrFalse[size];
        }
    }

    public String getVectorString() {
        String text = "";
        for (TrueOrFalse element : trueOrFalse) {
            if (element != null) {
                text += element + "\n";
            }
        }
        return text;
    }

    public void setTrueOrFalse(String question, String category, Boolean answer) {
        trueOrFalse[index] = new TrueOrFalse(answer, category, question);
        index++;
    }

    public String getQuestions() {
        String result = "";
        int contador = 1;
        for (int i = 0; i < trueOrFalse.length; i++) {
            if (trueOrFalse[i] != null) {
                result += (contador) + ")" + trueOrFalse[i].getQuestion() + "\n";
                contador++;
            }
        }
        return result;
    }

    public String getSpecificQuestion(int i) {
        return trueOrFalse[i].getQuestion();
    }

    public Boolean getSpecificAnswer(int i) {
        return trueOrFalse[i].getAnswer();
    }

    public TrueOrFalse getElemento() {
        int elementoRandom = (int) (Math.random() * index);

        return trueOrFalse[elementoRandom]; // falta validaciones (null, etc.. )
    }

    public TrueOrFalse getElemento(int index) {
        return trueOrFalse[index]; // falta validaciones (null, etc.. )
    }

    public void agregar(TrueOrFalse e) {
        if (index < TAMANO) {
            trueOrFalse[index] = e;
            index++;
        }
    }
    
    public void edit(int i, String question, String category, boolean answer) {
        trueOrFalse[i].setAnswer(answer);
        trueOrFalse[i].setQuestion(question);
        trueOrFalse[i].setCategory(category);
        
    }
    
    public TrueOrFalse eliminar(int i) {
        trueOrFalse[i-1] = null;
        orderByLastQuestionAscendingly();
        return trueOrFalse[i];
    }

    public void setCategory(int i, String category) {
        trueOrFalse[i].setCategory(category);
    }

    public int getTAMANO() {
        return TAMANO;
    }
    
    public void orderByLastQuestionAscendingly() {
        for (int i = 1; i < trueOrFalse.length; i++) {
            for (int j = 0; j < trueOrFalse.length - i; j++) {
                if (trueOrFalse[j] != null && trueOrFalse[j + 1] != null) {
                    if (trueOrFalse[j].getQuestion().compareTo(trueOrFalse[j + 1].getQuestion()) > 0) {
                        TrueOrFalse aux = trueOrFalse[j];
                        trueOrFalse[j] = trueOrFalse[j + 1];
                        trueOrFalse[j + 1] = aux;
                    } else {
                        if (trueOrFalse[j].getQuestion().compareTo(trueOrFalse[j + 1].getQuestion()) == 0) {
                            if (trueOrFalse[j].getAnswer().compareTo(trueOrFalse[j + 1].getAnswer()) > 0) {
                                TrueOrFalse aux = trueOrFalse[j];
                                trueOrFalse[j] = trueOrFalse[j + 1];
                                trueOrFalse[j + 1] = aux;
                            }

                        }

                    }
                }
            }
        }
    }
    
    
    
    public int getLenght() {
        return trueOrFalse.length;
    }
}
