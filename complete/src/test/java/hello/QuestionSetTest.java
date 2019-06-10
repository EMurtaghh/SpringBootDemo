package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionSetTest {

    @Test
    public void getLenTest(){
        UserQuestionSet que = new UserQuestionSet("99");
        int len = que.getLen();
        assertEquals(5, len);

    }

    @Test
    public void getQTest(){
        UserQuestionSet que = new UserQuestionSet("100");
        Question q = que.getQ("2");
        assertEquals("What is your favorite color?", q.getQuestionText());
    }

//    @Test
//    public void addQTest(){
//        UserQuestionSet que = new UserQuestionSet();
//
//    }
}