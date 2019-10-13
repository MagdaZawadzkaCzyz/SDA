package zwierz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@Getter
public class Cat implements Pet {
    private final List<FoodKind> catFood = Arrays.asList(FoodKind.MEAT,FoodKind.PETFOOD);
    @Override
    public List<FoodKind> foodKind() {
        return catFood;
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
