package Lesson6;

import java.util.Random;

public class Animal {
        final Random random = new Random();
        String name;
        String color;
        int age;
        int distanceRun;
        int distanceSwim;
        final int сatRunDistance = 200;
        final int dogRunDistance = 500;
        final int dogSwimDistance = 10;
        static int  countAnimal;



        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public int getDistanceRun () {
            return distanceRun;
        }

        public void setDistanceRun (int distanceRun){
            this.distanceRun = distanceRun;
        }

        public int getDistanceSwim () {
            return distanceSwim;
        }

        public void setDistanceSwim (int distanceSwim){
            this.distanceSwim = distanceSwim;
        }

    public Animal(String name, String color, int age, int distanceRun, int distanceSwim){
            this.name = name;
            this.color = color;
            this.age = age;
            this.distanceRun = distanceRun;
            this.distanceSwim = distanceSwim;
            countAnimal++;

        }

        @Override
        public String toString () {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    '}';
        }
        public void printInfo () {
            System.out.println(toString());
        }
        public void printRun (Animal animal){
            System.out.println("Животное побежало!");
        }

        public void printSwim () {
            System.out.println("Животное поплыло!");
        }

        public static int counter() {
            return countAnimal++;
        }

    public static void main(String[] args) {
        Cat cat = new Cat("Маркиз", "Серый в полоску", 3, 200, 0);
        System.out.println("Мы завели " + cat.getCountCat() + " кота(ов)!");
        cat.printInfo();
        cat.printRun(cat.random);
        cat.printSwim();
        System.out.println();

        Dog dog = new Dog("Бруно", "Каштановый", "Такса" ,5, 500, 10);
        System.out.println("Мы завели " + dog.getCountDog() + " собак(у)!");
        System.out.println(dog.getType());
        dog.printInfo();
        dog.printRun(dog.random);
        dog.printSwim(dog.random);
        System.out.println();
        System.out.println("Всего у нас дома " + counter() + " животных.");

    }
}
