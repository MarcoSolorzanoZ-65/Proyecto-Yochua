package proyecto.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:08 PM
 * @date Oct 21, 2021
 */
public class UniqueSelectionList {
        
    private UniqueSelection[] uniqueSelections;

    public UniqueSelectionList() {
        this.uniqueSelections = new UniqueSelection[3];
    }
    
    public UniqueSelectionList(UniqueSelection[] questionVector) {
        if (questionVector == null) {
            this.uniqueSelections = new UniqueSelection[10];
        } else {
            this.uniqueSelections = questionVector;
        }
    }

    public UniqueSelectionList(int size) {
        if (size < 0) {
            uniqueSelections = new UniqueSelection[10];
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
    
    public void setTrueOrFalse(int i, String question, String category, String answer, String type) {
        uniqueSelections[i] = new UniqueSelection(question, category, answer, type);
    }
    
    public String getAnswers() {
        String text = "";
        for (int i = 0; i < 3; i++) {
                    if (uniqueSelections[i].getAnswer() != null) {
                        text += uniqueSelections[i].getAnswer();
                    }
        }
        return text;
    }
}
