package hello;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuestionTest {
    @Test
    public void loadQuestionsFromJSONTest()  {
        //create the Question objects from json
        List<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add("ZXC");
        wrongAnswers.add("XCV");
        wrongAnswers.add("CVB");

        Question q1 = new Question("What is your name?", 1, "ASD", wrongAnswers);
        Question q2 = new Question("What is your quest?", 3, "ASD", wrongAnswers);
        Question q3 = new Question("What is the airspeed velocity of an unladen swallow?", 10, "ASD", wrongAnswers);
        try{
            System.out.println(JsonUtil.toJsonString(q1));
            System.out.println(JsonUtil.toJsonString(q2));
            System.out.println(JsonUtil.toJsonString(q3));
        }
        catch(Exception e){}

        //check if they are correct

    }

}
