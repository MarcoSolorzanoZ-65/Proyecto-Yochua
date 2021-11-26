package proyecto.sampleClasses;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class MS_Answers {

    private String answer;
    private boolean correct;

    public MS_Answers() {
    }

    public MS_Answers(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean getCorrect() {
        return correct;
    }

    @Override
    public String toString() {
        return answer + "-" + correct;
    }

}
