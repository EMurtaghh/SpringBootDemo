package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class GreetingController implements WebMvcConfigurer {

    @GetMapping("/test6")
    public String greetingForm() {
        return "horses";
    }

}
