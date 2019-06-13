package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RestingController {

    ParServer parServer;

    RestingController(){
        super();
        parServer = new ParServer();
    }

    @RequestMapping("/nextQuestion")
    public List<Question> nextQuestion() {
        return parServer.nextQuestion();
    }

}
