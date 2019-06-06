package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionsTest {

    @Test
    public void getLenTest(){
        Questions que = new Questions();
        int len = que.getLen();
        assertEquals(5, len);
    }

    @Test
    public void getQTest(){
        Questions que = new Questions();
        String q = que.getQ(0);
        assertEquals("What is your favorite color?", q);
    }

//    @Test
//    public void addQTest(){
//        Questions que = new Questions();
//
//    }
}