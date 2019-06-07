package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class GreetingController{

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }

    @GetMapping("/questions")
    public String greetingForm(Model model) {
        model.addAttribute("horses", new WormBones());
        return "horses";
    }

//    @PostMapping("/other")
//    public String checkPersonInfo(@Valid WormBones horses, BindingResult bindingResult) {
//        horses.checkValues();
//        if (bindingResult.hasErrors()) {
//            return "horses";
//        }
//
//        return "redirect:/results";
//    }

}
