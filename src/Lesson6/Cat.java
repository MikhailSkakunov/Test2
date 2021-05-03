package Lesson6;

import java.util.Random;

public class Cat extends Animal {

    public Cat (String name, String color, int age, int distanceRun, int distanceSwim) {
        super(name, color, age, distanceRun, distanceSwim);
    }
    public void printRun(Random random) {
        int catRunDistance = random.nextInt(200);
            System.out.println("Кот пробежал " + catRunDistance + " метрa(ов)!");
        }
    public void printSwim() {
        System.out.println("Кот утонул!!!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


 //   public int getCountAnimal() {
 //       return Animal.getCountAnimal();
    }
//}

