package hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class GreetingController implements WebMvcConfigurer {
    private ImageTask currentImage;

    public GreetingController() {
        super();
        this.currentImage = new ImageTask();
    }

    @GetMapping()
    public String greetingForm(Map<String, String> model) throws IOException {
        JsonUtil.toJsonFile("imageTask", currentImage);
        model.put("currentTask", "imageTask");
        return "horses";
    }

}
