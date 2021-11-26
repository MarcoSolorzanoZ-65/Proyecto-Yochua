package proyecto.sampleClasses;

import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:24:50 PM
 * @date Oct 21, 2021
 */
public class UniqueSelection extends Question {

    private String answer;
    private String incAnswer1;
    private String incAnswer2;
    private String incAnswer3;

    public UniqueSelection() {
    }

    public UniqueSelection(String answer, String incAnswer1, String incAnswer2, String incAnswer3, String category, String Question) {
        super(category, Question, "Unique Selection");
        this.answer = answer;
        this.incAnswer1 = incAnswer1;
        this.incAnswer2 = incAnswer2;
        this.incAnswer3 = incAnswer3;
    }

    // set
    public void setIncAnswer3(String incAnswer3) {
        this.incAnswer3 = incAnswer3;
    }

    public void setIncAnswer2(String incAnswer2) {
        this.incAnswer2 = incAnswer2;
    }

    public void setIncAnswer1(String incAnswer1) {
        this.incAnswer1 = incAnswer1;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    // get
    public String getAnswer() {
        return answer;
    }

    public String getIncAnswer1() {
        return incAnswer1;
    }

    public String getIncAnswer2() {
        return incAnswer2;
    }

    public String getIncAnswer3() {
        return incAnswer3;
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
        return getAnswer() + "-" + getIncAnswer1() + "-" + getIncAnswer2() + "-" + getIncAnswer3() + "-" + getQuestion() + "-" + getCategory();
    }

}
