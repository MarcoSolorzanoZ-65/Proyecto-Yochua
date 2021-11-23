package proyecto.sampleClasses;

import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:01:56 PM
 * @date Oct 21, 2021
 */
public class TrueOrFalse extends Question{
    

    private Boolean answer;
    
    public TrueOrFalse() {
    }

    public TrueOrFalse(Boolean answer, String category, String Question) {
        super(category, Question, "True or False");
        this.answer = answer;
    }

    //set

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }    

    @Override
    public void setCategory(String category) {
        super.setCategory(category); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuestion(String question) {
        super.setQuestion(question); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType(String type) {
        super.setType(type); //To change body of generated methods, choose Tools | Templates.
    }
    
    //get

    public Boolean getAnswer() {
        return answer;
    }

    @Override
    public String getCategory() {
        return super.getCategory(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
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
    public String toString() {
        return getQuestion() + "-" + getAnswer() + "-" + getCategory();
    }
    
    
}
