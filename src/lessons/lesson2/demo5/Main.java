package lessons.lesson2.demo5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String s = new String("hello");
//        String s2 = "hello";
//        String s3 = "hello";
//        System.out.println(s == s2); // false
//        System.out.println(s2 == s3);
//        System.out.println(s.equals(s2));
//        System.out.println(s2.equals(s3));


        String str = "hello world";
//        char[] chars = str.toCharArray();
        String adas = str.concat("adas"); // +
        String s = str.toLowerCase();
        String toUpperCase = str.toUpperCase();
        String substring = str.substring(2, 7);
        System.out.println(substring);
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.compareTo("hello world!"));
        System.out.println(str.endsWith("ld"));
        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(str.compareTo("HELLO WORLD"));
        System.out.println(str.compareToIgnoreCase("HELLO WORLD"));
        System.out.println(str.equals("HELLO WORLD")); //false
        System.out.println(str.equalsIgnoreCase("HELLO WORLD")); // true

//        System.out.print("ahghasgfd");
//        System.out.print("ahghasgfd");


//        System.out.println("enter your age");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        System.out.println("your age is - " + age);
//        scanner.close();


    }
}
