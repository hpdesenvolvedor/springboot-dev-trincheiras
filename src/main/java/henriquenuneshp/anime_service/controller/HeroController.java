package henriquenuneshp.anime_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("v1/herois")
public class HeroController {
    private static final List<String> HEROIS = List.of("Batman", "Sakura", "Goku");

    @GetMapping
    public List<String> listAllHerois(){
        return HEROIS;
    }

    @GetMapping("filter")
    public List<String> listAllParametros(@RequestParam(defaultValue = "") String name){
        return HEROIS.stream().filter(hero -> hero.equalsIgnoreCase(name)).toList();
    }

    @GetMapping("filterList")
    public List<String> listAllParametros(@RequestParam List<String> names){
        return HEROIS.stream().filter(names::contains).toList();
    }

}
