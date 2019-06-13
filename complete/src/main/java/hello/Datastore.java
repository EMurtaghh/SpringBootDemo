package hello;

import java.io.IOException;
import java.util.List;

public interface Datastore {
    List<Question> loadQuestions() throws IOException;
}
