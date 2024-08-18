package henriquenuneshp.anime_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hi")
    public String hi() {
        return "Seja bem vindo!";
    }
}
