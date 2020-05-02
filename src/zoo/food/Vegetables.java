package zoo.food;

import zoo.Food;

public class Vegetables extends Food implements FoodVegetables {
    public Vegetables(String nameFood) {super(nameFood);}


    @Override
    public String getNameFood(){
        return nameFood;
    }

}