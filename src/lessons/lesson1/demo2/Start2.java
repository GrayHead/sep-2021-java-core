package lessons.lesson1.demo2;

import java.util.ArrayList;

public class Start2 {


    public static void main(String[] args) {


//        User user = new User();
//        user.id = 1;
//        user.name = "vasya";

//        ArrayList<String> skills1 = new ArrayList<>();
//        skills1.add("html");
//        skills1.add("js");
//        skills1.add("react");
//        User vasya = new User(1, "vasya", 30, true, skills1);
//        vasya.setAge(-100);
//        System.out.println(vasya);
//        System.out.println(vasya.equals(vasya2));

        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("java");
        skills2.add("mysql");
        Address address = new Address("kostushka", "Lviv");
        User vasya2 = new User(1, "vasya", 30, true, skills2, address, Gender.MALE);


        System.out.println(vasya2);


    }
}
