package zoo.animals;

import zoo.Animal;
import zoo.types.Omnivorous;

public class Raccoon extends Animal implements Omnivorous {
    private double needVegetable = 0.1;
    private double needMeat = 0.1;

    public Raccoon(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needVegetable() {
        return super.getWeight() * this.needVegetable;
    }

    @Override
    public double needMeat() {
        return super.getWeight() * this.needMeat;
    }

    @Override
    public void feed(String food) {
        if (food.equals("meat")) {
            System.out.println(" съел корзину овощей и фруктов, которую вы ему поставили");
        } else {
            System.out.println(" съел корзину овощей и фруктов, которую вы ему поставили");
        }
    }
}