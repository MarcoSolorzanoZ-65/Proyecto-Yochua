package proyecto;

public abstract class Question {
    
    private String question;
    private String category;
    private String answer;
    private String type;
    private int id = 0;

    public Question() {
    }

    public Question(String question, String category, String answer, String type) {
        this.question = question;
        this.category = category;
        this.answer = answer;
        this.type = type;
        this.id++;
    }
    
    //set
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //get

    public String getAnswer() {
        return answer;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return answer + " " + category + " " + type + " " + question;
    }
    
    
}
