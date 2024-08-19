package henriquenuneshp.anime_service.domain;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Getter
@RequestMapping("v1/animes")
public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> animes(){
        Anime a1 = new Anime(1L, "Dragon Ball");
        Anime a2 = new Anime(2L, "Sakura");
        Anime a3 = new Anime(3L, "Yugi-Oh");

        return List.of(a1, a2, a3);
    }

}
