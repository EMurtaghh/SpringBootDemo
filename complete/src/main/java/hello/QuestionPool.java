package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionPool {
    List<Question> allQuestions;
    Datastore datastore;

    public QuestionPool(Datastore datastoreIn) throws IOException{
        datastore = datastoreIn;
        datastore.loadQuestions();
        allQuestions = datastore.loadQuestions();
    }
}
