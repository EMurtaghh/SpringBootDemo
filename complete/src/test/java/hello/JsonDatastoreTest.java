package hello;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class JsonDatastoreTest {

    @Test
    public void createQuestionPoolTest() throws Exception{
        QuestionPool myQP = new QuestionPool(new JsonDatastore());

        assertTrue(myQP.allQuestions.size() == 3);
    }
}
