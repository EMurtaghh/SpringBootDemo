package hello;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    enum Type{
        PLANE, STRUCTURE, ATTACHMENT, ZONE
    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "hibernateId")
//    private int hibernateId;

    private String id;

    @Column(name = "questionText")
    private String questionText;

    private String correctAnswer;

    private List<String> answers;

    private Type type;

    public Question(){}

    public Question(String idIn, String questionTextIn, String typeIn, String correctAnswerIn, List<String> answersIn){
        this.id = idIn;
        this.questionText = questionTextIn;
        this.correctAnswer = correctAnswerIn;
        this.answers = answersIn;
        setType(typeIn);
    }

    public String getId() {return id;}
    public void setId(String idIn) {id = idIn;}

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String textIn) {questionText = textIn;}

    public String getType() { return type.toString(); }
    public void setType(String typeIn) {
        if(typeIn.equals("PLANE")){
            this.type = Type.PLANE;
        }
        else if(typeIn.equals("STRUCTURE")){
            this.type = Type.STRUCTURE;
        }
        else if(typeIn.equals("ATTACHMENT")){
            this.type = Type.ATTACHMENT;
        }
        else if(typeIn.equals("ZONE")){
            this.type = Type.ZONE;
        }
        else{
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public String getCorrectAnswer() {return correctAnswer;}
    public void setCorrectAnswer(String correctAnswerIn) {correctAnswer = correctAnswerIn;}

    public List<String> getAnswers() {return answers;}
    public void setAnswers(List<String> answersIn) {answers = answersIn;}

    @Override
    public String toString() {
        return "Question [id=" + id + ", text=" + questionText + ", type=" + type.toString() + "]";
    }
}