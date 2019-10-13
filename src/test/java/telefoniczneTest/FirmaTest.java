package telefoniczneTest;

import lombok.ToString;
import org.junit.Test;
import telefoniczne.Firma;
import telefoniczne.NrTelefoniczny;

import static org.junit.Assert.assertEquals;

@ToString
public class FirmaTest {

    @Test
    public void testOpis() {
        Firma firma = new Firma();

        assertEquals("Dane kontaktowe firmy", firma.opis());
    }

    @Test
    public void testFirma() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "506602642");
        Firma firma = new Firma("SDA", "al.Racławickie 8, Lublin", nrTelefoniczny);

        //when
        //then
        assertEquals("SDA", firma.getNazwaFirmy());
        assertEquals("al.Racławickie 8, Lublin", firma.getAdres());
        assertEquals(nrTelefoniczny, firma.getNrTelefonu());

    }

}
