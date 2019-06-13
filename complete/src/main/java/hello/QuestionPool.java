package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionPool {
    List<Question> allQuestions;
    Datastore datastore;
    List<String> allTypes = new ArrayList<>();

    public QuestionPool(Datastore datastoreIn) throws IOException{
        datastore = datastoreIn;
        datastore.loadQuestions();
        allQuestions = datastore.loadQuestions();
    }

    public QuestionPool(Datastore datastoreIn, List<String> allTypesIn) throws IOException{
        datastore = datastoreIn;
        datastore.loadQuestions();
        allQuestions = datastore.loadQuestions();

        allTypes = allTypesIn;
    }


}
