package henriquenuneshp.anime_service.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Setter
public class Anime {
    private Long id;
    private String name;
    private static List<Anime> animes = new ArrayList<>();

    static {
        Anime a1 = new Anime(1L, "Dragon Ball");
        Anime a2 = new Anime(2L, "Sakura");
        Anime a3 = new Anime(3L, "Yugi-Oh");
        animes.addAll(List.of(a1, a2, a3));
    }

    public static List<Anime> getAnimes() {
        return animes;
    }
}
