package zwierz;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Pet> pets = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    private List<FoodKind> foodToBuy = new ArrayList();

    public void addPet(Pet pet) {

    }

    public void addFood(Food food) {

    }

    public void deletePet(Pet pet) {

    }

    public void introduce(Pet pet) {
    }

    public void feedPet() {
        pets.stream().forEach(a -> {
            List<FoodKind> foodKinds = a.foodKind();
            Food foods = food.stream().filter(b -> food.contains(b.getFoodKind())).findAny().orElse(null);
            if(foods ==null) {
                System.out.println("Brak jedzenia dla zwierzaka");
                foodToBuy.addAll(foodKinds);
            }else {
                System.out.println("Tu będzie metoda");
            }
        });

    }
}
