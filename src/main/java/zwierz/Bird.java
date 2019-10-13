package zwierz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@Getter

public class Bird implements Pet {
    private final List<FoodKind> birdFood = Arrays.asList(FoodKind.WHEAT,FoodKind.WORMS);

    @Override
    public List<FoodKind> foodKind() {
        return birdFood;
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
