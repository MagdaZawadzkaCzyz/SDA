package zwierz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter@Setter@AllArgsConstructor


public class Food {

    private String foodDescription;
    private String foodAmount;
    private FoodKind foodKind;
}
