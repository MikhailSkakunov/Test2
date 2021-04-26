package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static final int SIZE = 3;
    public static char[][] map = new char[SIZE][SIZE];
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '·';


    public static void main(String[] args) {
        mapFill();
        printMap();
        while (true) {
            hamanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            itTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Комьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
           private static void hamanTurn() {
            int x;
            int y;
               Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Введите координаты X Y.");
                x = readInt(scanner) - 1;
                y = readInt(scanner) - 1;

                 if (x <= -1 || y <= -1) {
                    System.out.println("Координаты должны быть числом!");
                     scanner.nextLine();}
                else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                    System.out.print("Вы ввели не верные координаты." + "\n" + "Попробуйте еще раз.");
                }
                else if (map[x][y] != DOT_EMPTY) {
                    System.out.println("Клетка уже занята!");
                }
                else break;
            }
                while (true) ;
                map[x][y] = DOT_X;
        }
        private static int readInt (Scanner scanner) {
               return scanner.hasNextInt() ? scanner.nextInt() : -1 ;
        }

        private static void itTurn() {
        int x;
        int y;
        Random random = new Random();
        do {
        x = random.nextInt(SIZE);
        y = random.nextInt(SIZE);

        }
        while (map[x][y] != DOT_EMPTY);
        map[x][y] = DOT_O;
    }
            private static boolean isWin(char symb) {
                if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
                if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
                if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;

                if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
                if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
                if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;

                if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
                if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
                return false;
            }
 /*       for (int i = 1; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    return true;
                }
            }
        }
        return false;
    }
  */      public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0;j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void mapFill() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        printHead();
        printBody();
        System.out.println();

    }
    public static void printHead() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    public static void printBody() {
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
