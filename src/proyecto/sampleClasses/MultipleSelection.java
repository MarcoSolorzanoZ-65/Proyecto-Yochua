package proyecto.sampleClasses;

import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:25 PM
 * @date Oct 21, 2021
 */
public class MultipleSelection extends Question {

    private MultipleSelectionAnswers[] multipleSelectionAnswers;

    public MultipleSelection() {
    }

    public MultipleSelection(String question, String category, String answer1) {
        super(question, category, answer1, "Multiple Selection");
        this.multipleSelectionAnswers = new MultipleSelectionAnswers[4];
    }

    // set

    @Override
    public void setAnswer(String answer) {
        super.setAnswer(answer); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuestion(String question) {
        super.setQuestion(question); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType(String type) {
        super.setType(type); // To change body of generated methods, choose Tools | Templates.
    }

    public void setAnswers(String answer1, String answer2, String answer3, String answer4, int correctAnswer1,
            int correctAnswer2, int correctAnswer3, int correctAnswer4) {
        multipleSelectionAnswers[1] = new MultipleSelectionAnswers(answer1, correctAnswer1);
        multipleSelectionAnswers[2] = new MultipleSelectionAnswers(answer2, correctAnswer2);
        multipleSelectionAnswers[3] = new MultipleSelectionAnswers(answer3, correctAnswer3);
        multipleSelectionAnswers[4] = new MultipleSelectionAnswers(answer4, correctAnswer4);
    }

    // get

    public String getVectorString() {
        String text = "";
        for (MultipleSelectionAnswers element : multipleSelectionAnswers) {
            if (element != null) {
                text += element + "\n";
            }
        }
        return text;
    }

    @Override
    public String getAnswer() {
        return super.getAnswer(); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCategory() {
        return super.getCategory(); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return super.getType(); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
