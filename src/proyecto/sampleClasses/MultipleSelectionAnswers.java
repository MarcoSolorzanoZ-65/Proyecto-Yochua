package proyecto.sampleClasses;

public class MultipleSelectionAnswers {
    private String answer;
    private int correctOrIncorrect;

    public MultipleSelectionAnswers() {
    }

    public MultipleSelectionAnswers(String answer, int correctOrIncorrect) {
        this.answer = answer;
        this.correctOrIncorrect = correctOrIncorrect;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrectOrIncorrect(int correctOrIncorrect) {
        this.correctOrIncorrect = correctOrIncorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public int getCorrectOrIncorrect() {
        return correctOrIncorrect;
    }

    @Override
    public String toString() {
        return answer + " " + correctOrIncorrect;
    }
}
