package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@RestController
public class HelloController {
    private UserQuestionSet que;

    private HelloController(){
        que = new UserQuestionSet("4");
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/qr")
    public Question questionPickRandom() {
        Random rand = new Random();
        int id = rand.nextInt(que.getLen());
        Question theQ = que.getQ(Integer.toString(id));
        return theQ;
    }


    //if statement version
    @RequestMapping("/q")
    public Question questionPick(@RequestParam String id) {
        Question picked = que.getQ(id);
        return picked;

    }
}


    //try catch version
//    @RequestMapping("/q")
//    public String questionPick(@RequestParam int index) {
//        try {
//            String picked = que.getQ(index);
//            return picked;
//        } catch (IndexOutOfBoundsException e) {
//            String picked = que.getQ(que.getLen() - 1);
//            return picked;
//        }
//
//    }
