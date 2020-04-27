package zoo.aviary;

import zoo.Animal;

import java.util.ArrayList;

public class aviaryOmni {
    private int maxNumberOfAnimals;
    public ArrayList<Animal> animalsOmni;

    public aviaryOmni(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
        this.animalsOmni = new ArrayList<>();
    }

    public boolean addAnimalToAviaryOmni(Animal a) {
        if (this.animalsOmni.size() == this.maxNumberOfAnimals) {
            return false;
        }
        this.animalsOmni.add(a);
        return true;
    }

    public void printInfo() {
        for (int i = 0; i < animalsOmni.size(); i++) {
            Animal a = animalsOmni.get(i);
            System.out.println("  " + a.getName() + " " + a.getClass().getSimpleName());
        }
    }

    public Integer maxCount() {
        return maxNumberOfAnimals;
    }


    public String getAnimal(int i) {
        Animal a = animalsOmni.get(i);
        return a.getClass().getSimpleName();
    }
}
