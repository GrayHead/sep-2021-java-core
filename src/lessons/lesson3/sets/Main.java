package lessons.lesson3.sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        HashSet<String> strings = new HashSet<>();
//        strings.add("asd");
//        strings.add("qwe");
//        strings.add("asd");
//        strings.add("zxc");
//
//        for (String string : strings) {
//            System.out.println(string.hashCode());
//        }

//        HashSet<Person> people = new HashSet<>();
//        people.add(new Person(1, "vasya"));
//        people.add(new Person(2, "kolya"));
//        people.add(new Person(3, "anton"));
//        people.add(new Person(1, "vasya"));
//
//        System.out.println(people);


//        LinkedHashSet<Person> people = new LinkedHashSet<>();
//        people.add(new Person(2, "kolya"));
//        people.add(new Person(1, "vasya"));
//        people.add(new Person(3, "anton"));
//        people.add(new Person(1, "vasya"));
//
//        System.out.println(people);


        TreeSet<Person> personsTreeSet = new TreeSet<>();

        personsTreeSet.add(new Person(2, "petya")); // 0
        personsTreeSet.add(new Person(2, "vasya")); // 1
        personsTreeSet.add(new Person(3, "anton")); // 2
        System.out.println(personsTreeSet);

//        Collection collection = personsTreeSet;

//        for (Person person : personsTreeSet) {
//            if (person.getId() == 2) {
//                personsTreeSet.remove(person);
//            }
//        }


        Iterator<Person> iterator = personsTreeSet.iterator();


        while (iterator.hasNext()) {

            Person person = iterator.next();
            if (person.getId() == 2) {
                iterator.remove();
            }

        }

        System.out.println(personsTreeSet);

    }


}
