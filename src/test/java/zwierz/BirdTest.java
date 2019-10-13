package zwierz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void testFoodKind() {
        //given
        Bird bird = new Bird();

        //when
        List<FoodKind> foodTypes = bird.foodKind();

        //then
        assertTrue(foodTypes.contains(FoodKind.WHEAT));
        assertTrue(foodTypes.contains(FoodKind.PETFOOD));
    }

}