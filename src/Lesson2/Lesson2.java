package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        leapYear(2000);
        bool10Ore20(5, 17);
        printConsole(1);
        positiveNegativeNumber(0);
        printLine("JAVA",3);

    }
       public static boolean bool10Ore20(int a, int d) {
           int sum = a + d;
       if (sum >= 10 && sum <= 20) {
           return true;
       }
           else {return false;}
       }

       public static void printConsole(int a) {
           if (a >= 0) {
               System.out.println("Число положительное.");
           }
           else {
               System.out.println("Число отрицательное.");
           }
       }

       public static boolean positiveNegativeNumber(int a) {
           if (a >= 0) { return false; }
           else { return true; }
       }

       public static void printLine(String str, int a) {
           for (int i = 0; i < a; i++) {
               System.out.println(str);
           }
       }

    public static boolean leapYear(int a) {
            if (a % 4 == 0 && a%100 != 0 || a%400 == 0) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
    }
}