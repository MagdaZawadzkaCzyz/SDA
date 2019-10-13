package telefoniczneTest;
import lombok.ToString;
import org.junit.Test;
import telefoniczne.NrTelefoniczny;

import static org.junit.Assert.*;
@ToString
    public class NrTelefonicznyTest {

        @Test
        public void nrTelefonicznyTest() {
            //given
            NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "506602642");
            //when
            //then
            assertEquals("081", nrTelefoniczny.getNrKierunkowy());
            assertEquals("506602642", nrTelefoniczny.getNrTelefonu());

        }
    }

