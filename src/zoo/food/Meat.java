package zoo.food;

import zoo.Food;

public class Meat extends Food implements FoodMeat {
    public Meat(String nameFood) {
        super(nameFood);
    }

    @Override
    public String getNameFood(){
        return nameFood;
    }

}
