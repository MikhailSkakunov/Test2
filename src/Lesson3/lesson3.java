package Lesson3;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        mas();
        array100();
        multiplyBy2();
        square();
        mas(6, 3);
        minMaxValue();
    }

        public static void mas() {
            int[] m = {1, 0, 1, 0};
            for (int i = 0; i < m.length; i++) {
                if (m[i] == 0) {
                   m[i] = 1;
                }
                else if (m[i] == 1) {
                    m[i] = 0;}
                System.out.print(m[i] + " ");
            }
            System.out.println();
        }
        public static void array100() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void  multiplyBy2() {
              int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
              for (int i = 0; i < array.length; i++) {
                  if (array[i] < 6) {
                      array[i] *=2;
                  }
                  System.out.print(array[i] + " ");
              }
        }

    public static void square() {
        int[][] sq = new int[5][5];
        for (int i = 0; i < sq.length; i++) {
               for (int j = 0; j < sq.length; j++) {
                    if (i == j ) {
                        sq[i][j] = 1;
                    }
            System.out.print(sq[i][j] + "  ");
               }
            System.out.println();
        }
        System.out.println();

        for (int i = sq.length - 1; i >= 0; i--) {
            for (int j = 0; j < sq.length; j++) {
                if (i == j && i == i+1 && j == j+1) {
                    sq[i][j] = 1;
                }
                System.out.print(sq[i][j] + "  ");
            }
            System.out.println();
        }
  //      System.out.println();
    }
    public static int[] mas(int len, int initialValue) {

         int[] mas = new int[len];
         for (int i = 0; i < mas.length; i++) {
             mas[i] = initialValue;

         }
        System.out.println(Arrays.toString(mas));
         return mas;
    }
    public static void minMaxValue() {
        int[] ar = {6, 3, 12, 18, 0, -1, 2, -3};
        for (int i = 0; i < ar.length; i++) {
            int min = 0;
            int max = 0;
            if (ar[i] < min) {
                min = ar[i];
                System.out.println(min);
            }

            if (ar[i] > max) {
                max = ar[i];
                System.out.println(max);
            }
        }
    }
}
