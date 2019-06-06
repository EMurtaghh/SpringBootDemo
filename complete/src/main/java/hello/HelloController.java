package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@RestController
public class HelloController {
    private QuestionSet que;

    private HelloController(){
        que = new QuestionSet();
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/qr")
    public String questionPickRandom() {
        Random rand = new Random();
        int index = rand.nextInt(que.getLen());
        String theQ = que.getQ(index);
        return theQ;
    }


    //if statement version
    @RequestMapping("/q")
    public String questionPick(@RequestParam int index) {
        if(index<que.getLen()){
            String picked = que.getQ(index);
            return picked;
        }
        else {
            String picked = que.getQ(que.getLen() - 1);
            return picked;
        }
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
