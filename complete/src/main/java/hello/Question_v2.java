package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "question")
public class Question_v2 {


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "hibernateId")
//    private int hibernateId;

    private String id;

    @Column(name = "questionText")
    private String questionText;

    private String correctAnswer;

    private List<String> answers;

    private QuestionType type;

    public Question_v2(){}

    public Question_v2(String idIn, String questionTextIn, String typeIn, String correctAnswerIn, List<String> answersIn){
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