package studenckieTest;

import org.junit.Test;
import studenckie.PeselValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeselValidatorTest {

    @Test
    public void testPeselNull() {
        //given
        String pesel = null;
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }

    @Test
    public void testPeselLengthShorter() {
        //given
        String pesel = "994673";
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);

    }

    @Test
    public void testPeselLengthLonger() {
        //given
        String pesel = "994673465850373";
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }

    @Test
    public void testPeselCorrect() {
        //given
        String pesel = "02070803628";
        PeselValidator validator = new PeselValidator();

        //given
        boolean result = validator.validate(pesel);

        //then
        assertTrue(result);
    }

    @Test
    public void testPeselIncorrect() {
        //given
        String pesel = "02070804628";
        PeselValidator validator = new PeselValidator();

        //given
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }

    @Test
    public void testPeselCorrectWithCharsUsed() {
        //given
        String pesel = "02070r03628";
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }

    @Test
    public void testPeselCorrectWithSpecialSigns() {
        //given
        String pesel = "020708036!8";
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }
    @Test
    public void testPeselCorrectWithSpace() {
        //given
        String pesel = "0207080362 8";
        PeselValidator validator = new PeselValidator();

        //when
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);
    }
}
