package zoo.animals;

import zoo.Animal;
import zoo.types.Carnivorous;

public class Penguin extends Animal implements Carnivorous {
    private double needEat = 0.1;

    public Penguin(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needMeat() {
        return super.getWeight() * this.needEat;
    }


    @Override
    public void feed(String food) {
        if (food.equals("meat")) {
            System.out.println(" съел мясо, которое вы ему дали");
        } else {
            System.out.println(" отказаля есть такую еду");
        }
    }
}

