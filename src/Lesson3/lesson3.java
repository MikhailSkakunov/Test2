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
        equalSum (new int[] {2, 2, 2, 2, 2, 2, 3, 3, 3, 1, 1, 1});
        moveValue();
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
                  System.out.print(Arrays.toString(array) + " ");
              }
            System.out.println();
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
            int min = ar[0];
            int max = ar[0];
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
    public static boolean equalSum( int[] arr) {
     int sum1 = 0;
     int sum2 = 0;
     for (int i = 0; i < arr.length; i++) {
         sum1 += arr[i];}
         System.out.println(sum1);

     for (int j = arr.length - 1; j >= 0; j--) {
         sum2 += arr[j];
         int sum3 = sum1 - sum2;
         System.out.println(sum2 + " " + sum3);
         if (sum3 != sum2) {
             continue;
         } else if (sum3 == sum2) {
             System.out.println(sum2 + " " + sum3);
             System.out.println(sum2);
             break;
         }
     }
     System.out.println("true");
     return true;
 }

    public static void moveValue() {
     int[] val = {1, 2, 3, 4, 5};
     int n = 1;
     for (int i = 0; i < val.length - n; i++) {
         int j = val[i];
         val[i] = val[i + n];
         val[i + n] = j;}
         for (int a : val)
             System.out.print(a + " ");}
        }

