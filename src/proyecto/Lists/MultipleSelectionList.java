package proyecto.Lists;

import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:39 PM
 * @date Oct 21, 2021
 */
public class MultipleSelectionList {

    private MultipleSelection[] multipleSelectionList;

    public MultipleSelectionList() {
        this.multipleSelectionList = new MultipleSelection[3];
    }

    public MultipleSelectionList(MultipleSelection[] questionVector) {
        if (questionVector == null) {
            this.multipleSelectionList = new MultipleSelection[10];
        } else {
            this.multipleSelectionList = questionVector;
        }
    }

    public MultipleSelectionList(int size) {
        if (size < 0) {
            multipleSelectionList = new MultipleSelection[10];
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

    public void setTrueOrFalse(int i, String question, String category, String answer, String type) {
        multipleSelectionList[i] = new MultipleSelection(question, category, answer, type);
    }

    public String getAnswers() {
        String text = "";
        for (int i = 0; i < 3; i++) {
            if (multipleSelectionList[i].getAnswer() != null) {
                text += multipleSelectionList[i].getAnswer();
            }
        }
        return text;
    }
}
