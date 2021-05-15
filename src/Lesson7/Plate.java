package Lesson7;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public void info () {
        System.out.println("Количество еды в миске " + food + ".");
    }

    public boolean foodAvailability (int countEat) {
        return getFood() >= countEat;
    }

    public int addFood (int countEat) {
        return food += countEat;
    }

    public int decreaseFood (int amount) {
      return   food -= amount;
    }
}

