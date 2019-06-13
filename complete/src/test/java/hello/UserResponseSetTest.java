package hello;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class UserResponseSetTest {

    @Test
    public void getResponseSizeTest() {
        List<String> q1A = new ArrayList<>();
        q1A.add("Bob");
        q1A.add("Cindy");
        q1A.add("Joey");
        q1A.add("King Arthur");
        Question q1 = new Question("Test Q1", "What is your name?", 1, "King Arthur", q1A);

        UserResponse response1 = new UserResponse("kandace", q1);
        UserResponseSet respSet=new UserResponseSet("kandace");
        respSet.addResponse(response1);

        List<String> q2A = new ArrayList<>();
        q2A.add("To Graduate");
        q2A.add("To make an ITS");
        q2A.add("To seek the Holy Grail");
        Question q2 = new Question("Test Q2", "What is your quest?", 3, "To seek the Holy Grail", q2A);

        UserResponse response2 = new UserResponse("kandace", q2);
        respSet.addResponse(response2);

        List<String> q3A = new ArrayList<>();
        q3A.add("10 m/s");
        q3A.add("20 m/s");
        q3A.add("30 m/s");
        q3A.add("African or European?");
        Question q3 = new Question("Test Q3","What is the airspeed velocity of an unladen swallow?", 10, "African or European?", q3A);

        UserResponse response3 = new UserResponse("kandace", q3);
        respSet.addResponse(response3);
        assertEquals(respSet.getUserResponsesSize(),3);
    }
    @Test
    public void getScoreTest(){
        List<String> q1A = new ArrayList<>();
        q1A.add("Bob");
        q1A.add("Cindy");
        q1A.add("Joey");
        q1A.add("King Arthur");
        Question q1 = new Question("Test Q1", "What is your name?", 1, "King Arthur", q1A);

        UserResponse response1 = new UserResponse("kandace", q1);
        UserResponseSet respSet=new UserResponseSet("kandace");
        respSet.addResponse(response1);
        response1.setResponse("King Arthur");

        List<String> q2A = new ArrayList<>();
        q2A.add("To Graduate");
        q2A.add("To make an ITS");
        q2A.add("To seek the Holy Grail");
        Question q2 = new Question("Test Q2", "What is your quest?", 3, "To seek the Holy Grail", q2A);

        UserResponse response2 = new UserResponse("kandace", q2);
        respSet.addResponse(response2);
        response2.setResponse("To seek the Holy Grail");

        List<String> q3A = new ArrayList<>();
        q3A.add("10 m/s");
        q3A.add("20 m/s");
        q3A.add("30 m/s");
        q3A.add("African or European?");
        Question q3 = new Question("Test Q3","What is the airspeed velocity of an unladen swallow?", 10, "African or European?", q3A);

        UserResponse response3 = new UserResponse("kandace", q3);
        respSet.addResponse(response3);
        response3.setResponse("African r European?");

        assertEquals(66.6,respSet.getScore(),0);
        //  assertEquals(100,respSet.getScore());
    }
}
