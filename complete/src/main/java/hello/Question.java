package hello;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Question(){} //hibernate recommends having a default constructor

    public Question(String questionTextIn, int diffiultyIn){
        this.questionText = questionTextIn;
        this.diffiulty = diffiultyIn;
    }

    public int getId(){ return id; }

    public String getQuestionText() { return questionText; }

    public int getDiffiulty() { return diffiulty; }

    @Override
    public String toString() {
        return "Question [id=" + id + ", text=" + questionText + ", difficulty=" + diffiulty + "]";
    }
}
