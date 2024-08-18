package henriquenuneshp.anime_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping ("v1/filmes")
@Slf4j
public class FilmesController {
    @GetMapping
    public List<String> findAllFilmes() throws InterruptedException {
        log.info(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1);
        return List.of("A Casa do Dragão", "Anjos da Noite", "Game of Thrones");
    }

}
