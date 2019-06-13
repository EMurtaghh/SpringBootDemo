package hello;

import java.io.IOException;
import java.util.List;

public class JsonDatastore implements Datastore{
    public List<Question> loadQuestions() throws IOException {
        //TODO: filename is currently hardcoded
        List<Question> questionsFromFile = JsonUtil.listFromJsonFile("src/test/resources/QuestionToJSONFileTest1.txt", Question.class);
        return questionsFromFile;
    }
}
