package bibliotekaPlyt;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BibliotekaTest {

    @Test
    public void testAdd() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        Biblioteka biblioteka = new Biblioteka();
        CD cd = new CD("Back in Black", "1996", listaUtworow);

        //when
        biblioteka.addCD(cd);
        List<CD> listaPlytResult = biblioteka.getListaPlyt();

        //then
        assertEquals(1, listaPlytResult.size());
        biblioteka.popCDByName("Black in back");
        listaPlytResult = biblioteka.getListaPlyt();
        assertEquals(1, listaPlytResult.size());
    }

    @Test
    public void testSearch() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1.7));
        Biblioteka biblioteka = new Biblioteka();
        CD cd = new CD("Back in black", "AC/DC", listaUtworow);

        //when
        biblioteka.addCD(cd);
        CD foundCD = biblioteka.search("Back in black");
        CD foundCD2 = biblioteka.search("Random title");

        //then
        assertNotNull(foundCD);
        assertNotNull(foundCD2);
    }

    @Test
    public void toStringTest() {
            //given
            List<Utwor> listaUtworow = new ArrayList<>();
            listaUtworow.add(new Utwor("Highway to hell", "AC/DC",1.7));
            listaUtworow.add(new Utwor("Thunder", "AC/DC",1.0));
            listaUtworow.add(new Utwor("randomSong", "AC/DC",2.4));
            Biblioteka biblioteka = new Biblioteka();
            CD cd = new CD("Back in black", "AC/DC",listaUtworow);

            //when
            biblioteka.addCD(cd);
            String listedLibrary = biblioteka.toString();

            //then
            assertEquals("Back in black AC/DC \n" +
                    "Highway to hell AC/DC 1.7\n" +
                    "Thunder AC/DC 1.0\n"+
                    "randomSong AC/DC 2.4",listedLibrary);
        }

        @Test
    public void testSave() throws FileNotFoundException {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway to hell", "AC/DC", 1.70));
        listaUtworow.add(new Utwor("Thunder", "AC/DC", 2.0));
        listaUtworow.add(new Utwor("randomSong", "AC/DC", 2.43));
        Biblioteka biblioteka = new Biblioteka();
        CD cd = new CD("Back in black", "1996", listaUtworow);
        biblioteka.addCD(cd);
        List<Utwor> listaUtworow2 = new ArrayList<>();
        CD cd2 = new CD("Sample Title", "2014", listaUtworow);
        listaUtworow2.add(new Utwor("Random file", "Random artist", 4.20));
        biblioteka.addCD(cd2);

        //when
        biblioteka.save();
        //then
        biblioteka.getListaPlyt().clear();
        assertEquals(0, biblioteka.getListaPlyt().size());
        biblioteka.read();
        assertEquals(2, biblioteka.getListaPlyt().size());
        assertEquals(3, biblioteka.getListaPlyt().get(0).getUtwory().size());
        assertEquals(1, biblioteka.getListaPlyt().get(1).getUtwory().size());
    }

    @Test
    public void testRead() throws FileNotFoundException {
        //given
        Biblioteka biblioteka = new Biblioteka();

        //when
        biblioteka.read();

        //then
        System.out.println(biblioteka);
        /*Array<CD> listaPlyt = biblioteka.getListaPlyt();
        assertEquals(2,listaPlyt.size());
        assertEquals(3, listaPlyt.size());
    }*/
    }
}
