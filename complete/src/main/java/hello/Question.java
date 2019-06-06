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
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "hibernateId")
//    private int hibernateId;

    private String id;

    @Column(name = "difficulty")
    private int difficulty;

    @Column(name = "questionText")
    private String questionText;

    private String correctAnswer;

    private List<String> answers;

    public Question(){}

    public Question(String idIn, String questionTextIn, int difficultyIn, String correctAnswerIn, List<String> answersIn){
        this.id = idIn;
        this.questionText = questionTextIn;
        this.difficulty = difficultyIn;
        this.correctAnswer = correctAnswerIn;
        this.answers = answersIn;
    }

    public String getId() {return id;}
    public void setId(String idIn) {id = idIn;}

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String textIn) {questionText = textIn;}

    public int getDifficulty() { return difficulty; }
    public void setDifficulty(int difficultyIn) { difficulty = difficultyIn;}

    public String getCorrectAnswer() {return correctAnswer;}
    public void setCorrectAnswer(String correctAnswerIn) {correctAnswer = correctAnswerIn;}

    public List<String> getAnswers() {return answers;}
    public void setAnswers(List<String> answersIn) {answers = answersIn;}

    @Override
    public String toString() {
        return "Question [id=" + id + ", text=" + questionText + ", difficulty=" + difficulty + "]";
    }
}
