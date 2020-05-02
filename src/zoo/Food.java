package zoo;

public abstract class Food {
    public String nameFood;
    double countOffoodMeat = 1000;
    double countOffoodVeg = 1000;

    public Food(String nameFood) {
        this.nameFood = nameFood;
    }

    String getNameFood(){
        return nameFood;
    }

}
