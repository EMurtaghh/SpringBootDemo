package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionPool_v2 {
    List<Question> allQuestions;
    Datastore datastore;
    List<String> allTypes = new ArrayList<>();

    public QuestionPool_v2(Datastore datastoreIn) throws IOException{
        datastore = datastoreIn;
        datastore.loadQuestions();
        allQuestions = datastore.loadQuestions();
    }

    public QuestionPool_v2(Datastore datastoreIn, List<String> allTypesIn) throws IOException{
        datastore = datastoreIn;
        datastore.loadQuestions();
        allQuestions = datastore.loadQuestions();

        allTypes = allTypesIn;
    }


}
