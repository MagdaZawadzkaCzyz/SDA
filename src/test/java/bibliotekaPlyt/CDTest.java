package bibliotekaPlyt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CDTest {

    @Test
    public void testConstructor() {
        //given
        List<Utwor> inputUtwor = new ArrayList<Utwor>();
        CD cd = new CD("TataKazika", "1993", inputUtwor);
        //when
        List<Utwor> resultUtwory = cd.getUtwory();
        //then
        assertEquals(inputUtwor,resultUtwory);
    }
    @Test
    public void testSearch() {
        //given
        List<Utwor> inputUtwor = new ArrayList<>();
        inputUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20 ));
        inputUtwor.add(new Utwor ("Maciek, ja tylko żartowałem", "Kazik", 4.30));
        inputUtwor.add(new Utwor ("Baranek", "Kazik", 2.30));
        CD cd = new CD("Tata Kazika", "1993", inputUtwor);

        //when
       Utwor znalezionyUtwor = cd.search("Maciek, jak tylko żartowałem");

       //then
        assertEquals("Kazik", znalezionyUtwor.getArtist());
        assertEquals("Maciek, ja tylko żartowałem", znalezionyUtwor.getTitle());
    }

    @Test
    public void testNotFound() {
        //given
        List<Utwor> inputUtwor = new ArrayList<>();
        inputUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20 ));
        inputUtwor.add(new Utwor ("Maciek, jak tylko żartowałem", "Kazik", 4.30));
        inputUtwor.add(new Utwor ("Baranek", "Kazik", 2.30));
        CD cd = new CD("Tata Kazika", "1993", inputUtwor);

        //when
        Utwor znalezionyUtwor = cd.search("Utwór, którego nie ma na płycie");

        //then
        assertNull(znalezionyUtwor);
    }

    @Test
    public void testSearchNull() {
        //given
        List<Utwor> inputUtwor = new ArrayList<>();
        inputUtwor.add(new Utwor("Dziewczyna bez zęba na przedzie", "Kazik", 3.20 ));
        inputUtwor.add(new Utwor ("Maciek, jak tylko żartowałem", "Kazik", 4.30));
        inputUtwor.add(new Utwor ("Baranek", "Kazik", 2.30));
        CD cd = new CD("Tata Kazika", "1993", inputUtwor);

        //when
        Utwor znalezionyUtwor = cd.search( null);

        //then
        assertNull(znalezionyUtwor);
    }

}