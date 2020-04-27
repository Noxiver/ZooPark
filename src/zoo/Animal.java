package zoo;

public abstract class Animal {
    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }


    public void feed(String food) {
    }

    public double needMeat() {
        double a = 0.2;
        return a;
    }

    public double needVegetable() {
        double a = 0.2;
        return a;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }


    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal) obj;
        return this.name.equals(a.getName()) && this.getClass().getSimpleName().equals(a.getClass().getSimpleName());
    }


}
