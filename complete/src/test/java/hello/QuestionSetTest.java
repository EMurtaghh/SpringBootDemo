package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionSetTest {

    @Test
    public void getLenTest(){
        QuestionSet que = new QuestionSet();
        int len = que.getLen();
        assertEquals(5, len);
    }

    @Test
    public void getQTest(){
        QuestionSet que = new QuestionSet();
        String q = que.getQ(0);
        assertEquals("What is your favorite color?", q);
    }

//    @Test
//    public void addQTest(){
//        QuestionSet que = new QuestionSet();
//
//    }
}