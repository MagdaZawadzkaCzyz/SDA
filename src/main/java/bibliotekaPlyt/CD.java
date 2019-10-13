package bibliotekaPlyt;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter

public class CD {
    private String title;
    private String year;
    private List<Utwor> utwory = new ArrayList<>();

    //wyszukiwanie na Straemie
    public Utwor search(String query) {
        return utwory.stream().filter(a -> a.getTitle().equals(query)).findAny().orElse(null);
    }

    //lub wyszukiwanie w pętli
    public Utwor search2(String query) {
        for (Utwor utwor : utwory) {
            if (utwor.getTitle().equals(query)) {
                return utwor;
            }
        }
        return null;
    }

    public String toString() {
        List<String> listaUtworow = utwory.stream()
                .map(a -> a.toString())
                .collect(Collectors.toList());
        // String tmp = " ";
        // for(String value : listaUtworow) {
        //     tmp += value+"\n";
        // }
        String reduce = listaUtworow.stream().reduce("", (tmp, a) -> tmp += "\n" + a);
        return title + " " + year +" " + reduce;

    }
}
