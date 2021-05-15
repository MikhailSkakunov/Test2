package Lesson6;

import java.util.Random;

public class Cat extends Animal {
    static int countCat;
    public Cat(String name, String color, int age, int distanceRun, int distanceSwim) {
        super(name, color, age, distanceRun, distanceSwim);
        countCat++;
    }
    public void printRun(Random random) {
            int catRunDistance = random.nextInt(200);
            System.out.println("Кот пробежал " + catRunDistance + " метрa(ов)!");
        }
    public void printSwim() {
        System.out.println("Кот не умел плавать и утонул!!!");
    }
    public static int getCountCat() {
        return countCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

