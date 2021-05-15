package Lesson7;

public class StringWork {
    public static void main(String[] args) {
        String str = "I like JAVA!!!";
        printString(str);
    }
    private static void printString (String str) {
        System.out.println(str);

        System.out.println(str.charAt(str.length() - 1));

        System.out.println(str.endsWith("!!!"));

        System.out.println(str.startsWith("I like"));

        System.out.println(str.contains("JAVA"));

        System.out.println(str.lastIndexOf("JAVA"));

        System.out.println(str.replace("A", "O"));

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());


        String str1 = "JAVA";

        int x = str.indexOf(str1);
        System.out.println(x);
        int y = str1.length();
        System.out.println(y);

        System.out.println(str.substring(0,x) + str.substring(x+y));
    }
}
