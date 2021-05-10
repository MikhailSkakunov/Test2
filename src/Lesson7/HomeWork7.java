package Lesson7;

import java.util.Scanner;

public class HomeWork7 {


    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурзик", 5, false);
        cats[1] = new Cat("Барсик", 3, false);
        cats[2] = new Cat("Васька", 4, false);
        cats[3] = new Cat("Абрахамсон", 7, false);

        Plate plate = new Plate(11);
        plate.info();


        printInfo(cats);
        feedAllCats(cats, plate);
        plate.info();
 //       addFood(plate);


    }

    private static void feedAllCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            while (cat.isSatiety() == false) {
                cat.eat(plate);
            }
        }
        System.out.println("Все коты наелись!!!");
    }

    private static void printInfo(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.print(" " + cat.getName() + " " + " " + cat.getAppetite() + " " + " " + cat.isSatiety());
        }
        System.out.println();
        System.out.println();
    }

 /*   private static void addFood(Plate plate) {
    Scanner scanner = new Scanner(System.in);
    int countEat = scanner.nextInt();
        plate.addFood(countEat);
    }
*/}
