package proyecto.UniqueSelection;

import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:24:50 PM
 * @date Oct 21, 2021
 */
public class UniqueSelection extends Question {

    public UniqueSelection() {
    }
    
    public UniqueSelection(String question, String category, String answer, String type) {
        super(question, category, answer, type);
    }
    
    //set
    
    @Override
    public void setAnswer(String answer) {
        super.setAnswer(answer); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public String getAnswer() {
        return super.getAnswer(); //To change body of generated methods, choose Tools | Templates.
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
        return super.toString();
    }
    
    
}
