package zwierz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@Getter
public class Fish implements Pet {
    private final List<FoodKind> fishFood = Arrays.asList(FoodKind.WORMS,FoodKind.PETFOOD);
    @Override
    public List<FoodKind> foodKind() {
        return fishFood;
    }

    @Override
    public void doSound() {

    }

    @Override
    public void doIntroduce() {

    }

    @Override
    public void doFeed(Food food) {

    }

    @Override
    public void doTrick() {

    }
}
