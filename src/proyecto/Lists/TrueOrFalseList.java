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
    public TrueOrFalseList() {
        this.trueOrFalse = new TrueOrFalse[3];
    }
    
    public TrueOrFalseList(TrueOrFalse[] questionVector) {
        if (questionVector == null) {
            this.trueOrFalse = new TrueOrFalse[10];
        } else {
            this.trueOrFalse = questionVector;
        }
    }

    public TrueOrFalseList(int size) {
        if (size < 0) {
            trueOrFalse = new TrueOrFalse[10];
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
    
    public void setTrueOrFalse(String question, String category, String answer) {
        trueOrFalse[index] = new TrueOrFalse(question, category, answer);
        index++;
    }
    
    public String getAnswers() {
        String text = "";
        for (int i = 0; i < 3; i++) {
                if (trueOrFalse[i].getAnswer() != null) {
                    text += trueOrFalse[i].getAnswer();
                }
        }
        return text;
    }
}
