package hello;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void loadQuestionsFromJSONTest()  {
        //create the Question objects from json
        List<String> q1A = new ArrayList<>();
        q1A.add("Bob");
        q1A.add("Cindy");
        q1A.add("Joey");
        q1A.add("King Arthur");
        Question q1 = new Question("Test Q1", "What is your name?", 1, "King Arthur", q1A);
        List<String> q2A = new ArrayList<>();
        q2A.add("To Graduate");
        q2A.add("To make an ITS");
        q2A.add("To seek the Holy Grail");
        Question q2 = new Question("Test Q2", "What is your quest?", 3, "To seek the Holy Grail", q2A);
        List<String> q3A = new ArrayList<>();
        q3A.add("10 m/s");
        q3A.add("20 m/s");
        q3A.add("30 m/s");
        q3A.add("African or European?");
        Question q3 = new Question("Test Q3","What is the airspeed velocity of an unladen swallow?", 10, "African or European?", q3A);

        List<Question> allQuestions = new ArrayList<>();
        allQuestions.add(q1);
        allQuestions.add(q2);
        allQuestions.add(q3);

        //Write to JSON file
        try{
            JsonUtil.toJsonFile("src/test/resources/QuestionToJSONFileTest1.txt", allQuestions);
        }
        catch(Exception e){}

        //load from JSON file
        try{
            List<Question> questionsFromFile = JsonUtil.listFromJsonFile("src/test/resources/QuestionToJSONFileTest1.txt", Question.class);
            assertEquals(q1.getQuestionText(), questionsFromFile.get(0).getQuestionText());
            assertEquals(q2.getQuestionText(), questionsFromFile.get(1).getQuestionText());
            assertEquals(q3.getQuestionText(), questionsFromFile.get(2).getQuestionText());
        }
        catch(Exception ee){
            //loading from JSON failed
            assertTrue(false);
        }

    }

}
