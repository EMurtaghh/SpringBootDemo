package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Random;

@RestController
public class HelloController {
    private Questions que;

    private HelloController(){
        que = new Questions();
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/qr")
    public String questionPickRandom() {
        Questions quest = new Questions();
        Random rand = new Random();
        int index = rand.nextInt(que.getLen());
        String theQ = que.getQ(index);
        return theQ;
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


    //if statement version
    @RequestMapping("/q")
    public String questionPick(@RequestParam int index) {
        //Questions que = new Questions();
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
