package henriquenuneshp.anime_service.controller;

import henriquenuneshp.anime_service.domain.Anime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("v1/filmes")
@Slf4j
public class FilmesController {

    @GetMapping
    public List<Anime> listAll(@RequestParam(required = false) String name) {
        var animes = Anime.animes();
        if(name == null) return animes;

        return animes.stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }
    @GetMapping("{id}")
    public Anime findById(@PathVariable Long id) {
        return Anime.animes()
                .stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst().orElse(null);
    }

}
