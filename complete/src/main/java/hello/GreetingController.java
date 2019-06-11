package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class GreetingController implements WebMvcConfigurer {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }

    @GetMapping("/oof")
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
