package proyecto.sampleClasses;

import proyecto.Lists.MS_AnswerList;
import proyecto.Question;

/**
 * @author Marco Zumbado Solorzano C18736
 * @time 8:25:25 PM
 * @date Oct 21, 2021
 */
public class MultipleSelection extends Question {

    MS_AnswerList mS_AnswerList = new MS_AnswerList();

    public MultipleSelection() {
    }

    public MultipleSelection(String answer1, boolean correct1, String answer2, boolean correct2,
            String answer3, boolean correct3, String answer4, boolean correct4, String category,
            String Question) {
        super(category, Question, "Multiple Selection");
        mS_AnswerList.setMS_Answers(answer1, correct1);
        mS_AnswerList.setMS_Answers(answer2, correct2);
        mS_AnswerList.setMS_Answers(answer3, correct3);
        mS_AnswerList.setMS_Answers(answer4, correct4);
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

    public MS_AnswerList getmS_AnswerList() {
        return mS_AnswerList;
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
    
    public String mostrarDatos() {
        return "Pregunta: " + getQuestion() + "\nRespuestas: " + getmS_AnswerList().mostrarRespuestas() + "\nCategoria: " + getCategory();
    }
    
    @Override
    public String toString() {
        return getQuestion() + "-" + getmS_AnswerList().getVectorString() + getCategory();
    }

}
