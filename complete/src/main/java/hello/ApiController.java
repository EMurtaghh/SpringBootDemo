package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    ParServer parServer;

    ApiController(){
        super();
        parServer = new ParServer();
    }

    @RequestMapping("/nextQuestion")
    public Question nextQuestion() {
        return parServer.nextQuestion();
    }

}
