package lessons.lesson3.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> dogs = new ArrayList<>(); //
        dogs.add("cocker");// 0
        dogs.add("mastif");// 1
        dogs.add("pudel");// 2
        dogs.add("pitbul");// 3
//       old = 4 ; (old *3)/2+1 = 7

        System.out.println(dogs.get(2));
        dogs.remove(2);


        List<String> dogsToRemove = new ArrayList<>();
        dogsToRemove.add("cocker");
        dogsToRemove.add("pitbul");
//        dogs.removeAll(dogsToRemove);
//        System.out.println(dogs);


        String cocker = dogs.get(0);// coker
//        dogs.remove(0); // rem cocker
//        dogs.remove("cocker"); // rem cocker

        System.out.println(dogs.isEmpty()); // false
        System.out.println(dogs.containsAll(dogsToRemove)); // true
        System.out.println(dogs.subList(0, 2)); // cocker mastif
        System.out.println(dogs.size());// 4
        System.out.println(dogs.contains("pitbul")); // true


        LinkedList<String> cats = new LinkedList<>();
        cats.add("cat1"); // ??
        cats.add("cat2"); // ??
        cats.add("cat3"); // ??
        cats.add("cat4"); // ??
        cats.get(2); // cat3

//        cats.set(2, "ahgsfdhagfswq");


//        List<List> lists = new LinkedList<>();
//        lists.add(dogs);
//        lists.add(cats);

//        List<Collection> collections = new ArrayList<>();
//        collections.add(dogs);
//        collections.add(cats);


    }
}
