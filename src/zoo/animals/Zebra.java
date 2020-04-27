package zoo.animals;

import zoo.Animal;
import zoo.types.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public double needEat = 0.2;

    public Zebra(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needVegetable() {
        return this.needEat * super.getWeight();
    }

    @Override
    public void feed(String food) {
        if (food.equals("vegetables")) {
            System.out.println(" съела корзину овощей и фруктов, которую вы ей поставили");
        } else {
            System.out.println(" отказалась есть такую еду");
        }
    }


}


