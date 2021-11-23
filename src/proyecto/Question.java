package proyecto;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public abstract class Question {
    private String category;
    private String question;
    private String type;
    private int id;

    public Question() {
    }
    
    
    public Question(String category, String Question, String Type) {
        this.category = category;
        this.question = Question;
        this.type = Type;
        id++;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String Question) {
        this.question = Question;
    }

    public void setType(String Type) {
        this.type = Type;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return question + " " + type + " " + category;
    }
    
    
    
}
