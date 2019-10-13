package bibliotekaPlyt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Utwor {


    private String title;
    private String artist;
    private double time;

    @Override
    public String toString() {
        return title + " " + artist + " " + time;
    }
}

