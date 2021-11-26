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
    public int TAMANO = 10;

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
        String text = "";
        int cont = 1;
        for (int i = 0; i < TAMANO; i++) {
            if (trueOrFalse[i].getQuestion() != null) {
                text += cont + ") " + trueOrFalse[i].getQuestion() + "\n";
                cont++;
            }
        }
        return text;
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

    public void setCategory(int i, String category) {
        trueOrFalse[i].setCategory(category);
    }

    public int getTAMANO() {
        return TAMANO;
    }

}
