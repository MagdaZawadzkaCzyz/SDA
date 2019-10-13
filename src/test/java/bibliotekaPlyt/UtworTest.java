package bibliotekaPlyt;

import bibliotekaPlyt.Utwor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class UtworTest {
    @Test
    public void testConstructor() {
        //given
        Utwor utwor = new Utwor("Baranek", "Kult", 3.4);
        //when
        String autor = utwor.getArtist();
        String tytul = utwor.getTitle();
        double czas = utwor.getTime();

        //then
        assertEquals("Kult", autor);
        assertEquals("Baranek", tytul);
        assertEquals(Double.valueOf(3.4), Double.valueOf(czas));
    }
}
