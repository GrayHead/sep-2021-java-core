package lessons.lesson4.demo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        //       stream + sort

        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos", true));
        users.add(new User(1, "ananas", true));
        users.add(new User(1, "ananas", true));
        users.add(new User(3, "banan", false));
        users.add(new User(5, "tomat", false));
        users.add(new User(4, "potatos", true));
        users.add(new User(6, "mango", false));
        users.add(new User(6, "mango", false));


//        users.forEach(user -> System.out.println(user));
//        users.forEach(System.out::println);

//        List<User> filterdedUsers = new ArrayList<>();
//        for (User user : users) {
//            if (user.isStatus()) {
//                filterdedUsers.add(user);
//            }
//        }


//        List<SimpleUser> filter
//                = users.stream()
//                .skip(2)
//                .filter(user -> !user.isStatus())
//                .distinct()
//                .sorted((o1, o2) -> o2.getId() - o1.getId())
//                .map(user -> new SimpleUser(user.getId(), user.getName()))
//                .limit(1)
//                .collect(toList());
//        System.out.println(filter);


//        boolean b = users.stream().allMatch(user -> user.isStatus());
        Optional<User> optionalUser = users.stream().findAny();
//        optionalUser.orElse(new User(111, "asdsad", false));


    }
}
