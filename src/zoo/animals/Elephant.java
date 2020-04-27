package zoo.animals;

import zoo.Animal;
import zoo.types.Herbivore;

public class Elephant extends Animal implements Herbivore {
    public double needEat = 0.4;

    public Elephant(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needVegetable() {
        return this.needEat * super.getWeight();
    }

    @Override
    public void feed(String food) {
        if (food.equals("vegetables")) {
            System.out.println(" съел корзину овощей и фруктов, которую вы ему поставили");
        } else {
            System.out.println(" отказался есть такую еду");
        }
    }


}


