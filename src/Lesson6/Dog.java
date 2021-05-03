package Lesson6;
import java.util.Random;
public class Dog extends Animal {
    private final String type;

    public void printRun(Random random) {
        int dogRunDistance = random.nextInt(500);
        System.out.println("Собака пробежала " + dogRunDistance + " метра(ов)!");
    }
    public void printSwim(Random random) {
        int dogSwimDistance = random.nextInt(10);
        System.out.println("Собака проплыла " + dogSwimDistance + " метра(ов)!");
    }

    public Dog(String name, String color, String type, int age, int distanceRun, int distanceSwim) {
        super(name, color, age, distanceRun, distanceSwim);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
