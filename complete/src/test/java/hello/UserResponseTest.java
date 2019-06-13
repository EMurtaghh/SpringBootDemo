package hello;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserResponseTest {

    @Test
    public void checkResponseTest(){
        List<String> q1A = new ArrayList<>();
        q1A.add("Bob");
        q1A.add("Cindy");
        q1A.add("Joey");
        q1A.add("King Arthur");
        Question q1 = new Question("Test Q1", "What is your name?", 1, "King Arthur", q1A);
        UserResponse response=new UserResponse("kandace",q1);
        response.setResponse("hi");
        assertEquals(response.checkResponse(),false);
    }

}
