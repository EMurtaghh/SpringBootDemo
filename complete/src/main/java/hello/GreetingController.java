package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @GetMapping("/questions")
    public String greetingForm(Model model) {
        model.addAttribute("horses", new WormBones());
        return "horses";
    }

//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting) {
//        greeting.checkCity();
//        return "result";
//    }

}
