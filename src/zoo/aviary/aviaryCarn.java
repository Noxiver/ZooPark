package zoo.aviary;

import zoo.Animal;

import java.sql.Array;
import java.util.ArrayList;

public class aviaryCarn {
    private int maxNumberOfAnimals;
    public ArrayList<Animal> animalsCarn;

    public aviaryCarn(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
        this.animalsCarn = new ArrayList<>();
    }

    public boolean addAnimalToAviaryCarn(Animal a) {
        if (this.animalsCarn.size() == this.maxNumberOfAnimals) {
            return false;
        }
        this.animalsCarn.add(a);
        return true;
    }

    public void printInfo() {
        for (int i = 0; i < animalsCarn.size(); i++) {
            Animal a = animalsCarn.get(i);
            System.out.println("  " + a.getName() + " " + a.getClass().getSimpleName());
        }
    }

    public Integer maxCount() {
        return maxNumberOfAnimals;
    }

    public String getAnimal(int i) {
        Animal a = animalsCarn.get(i);
        return a.getClass().getSimpleName();
    }

}
