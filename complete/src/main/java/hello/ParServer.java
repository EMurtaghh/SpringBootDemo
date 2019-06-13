package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class ParServer {
    private  Logger logger = LogManager.getLogger(this.getClass());

    public List<Question> nextQuestion() {
        try {
            List<Question> questionsFromFile = JsonUtil.listFromJsonFile("src/test/resources/author/imageTask.json", Question.class);
            return questionsFromFile;
        }
        catch (IOException e){
            logger.error("sample questions not found", e);
            return null;
        }
    }
}
