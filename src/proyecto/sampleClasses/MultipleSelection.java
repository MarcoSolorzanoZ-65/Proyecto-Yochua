package proyecto.sampleClasses;

import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:25 PM
 * @date Oct 21, 2021
 */
public class MultipleSelection extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    public MultipleSelection() {
    }

    public MultipleSelection(String answer1, String answer2, String answer3, String answer4, String category, String Question) {
        super(category, Question, "Multiple Selection");
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    // set
    @Override
    public void setQuestion(String Question) {
        super.setQuestion(Question); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType(String Type) {
        super.setType(Type); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    
    
    // get
    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    @Override
    public String getCategory() {
        return super.getCategory(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getQuestion() {
        return super.getQuestion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return super.getType(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
