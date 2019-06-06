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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "difficulty")
    private int diffiulty;

    @Column(name = "questionText")
    private String questionText;

    private String correctAnswer;

    private List<String> wrongAnswers;

    public Question(){}

    public Question(String questionTextIn, int diffiultyIn, String correctAnswerIn, List<String> wrongAnswersIn){
        this.questionText = questionTextIn;
        this.diffiulty = diffiultyIn;
        this.correctAnswer = correctAnswerIn;
        this.wrongAnswers = wrongAnswersIn;
    }

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String textIn) {questionText = textIn;}

    public int getDiffiulty() { return diffiulty; }
    public void setDiffiulty(int difficultyIn) { diffiulty = difficultyIn;}

    public String getCorrectAnswer() {return correctAnswer;}
    public void setCorrectAnswer(String correctAnswerIn) {correctAnswer = correctAnswerIn;}

    public List<String> getWrongAnswers() {return wrongAnswers;}
    public void setWrongAnswers(List<String> wrongAnswersIn) {wrongAnswers = wrongAnswersIn;}

    @Override
    public String toString() {
        return "Question [id=" + id + ", text=" + questionText + ", difficulty=" + diffiulty + "]";
    }
}
