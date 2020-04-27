package zoo.aviary;

import zoo.Animal;

import java.util.ArrayList;

public class aviaryHerb {

    private int maxNumberOfAnimals;
    public ArrayList<Animal> animalsHerb;

    public aviaryHerb(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
        this.animalsHerb = new ArrayList<>();
    }

    public boolean addAnimalToAviaryHerb(Animal a) {
        if (this.animalsHerb.size() == this.maxNumberOfAnimals) {
            return false;
        }
        this.animalsHerb.add(a);
        return true;
    }

    public void printInfo() {
        for (int i = 0; i < animalsHerb.size(); i++) {
            Animal a = animalsHerb.get(i);
            System.out.println("  " + a.getName() + " " + a.getClass().getSimpleName()); // animals[i]
            //  System.out.println(animalsHerb.get(i));
        }
    }

    public String getAnimal(int i) {
        Animal a = animalsHerb.get(i);
        return a.getClass().getSimpleName();
    }

    public Integer maxCount() {
        return maxNumberOfAnimals;
    }
}
