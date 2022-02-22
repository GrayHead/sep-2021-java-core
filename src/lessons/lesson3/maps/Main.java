package lessons.lesson3.maps;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
//        map.put("four", 5);
        System.out.println(map);
//        map.replace("one", 1, 11);
//        map.replace("one",  11);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("one")); // 1
        System.out.println(map.getOrDefault("five", 100500));

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries); // Set

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
            if (next.getValue() == 2) {
                iterator.remove();
            }
        }
        System.out.println(map);


//        TreeMap<Aka, Friend> friendTreeMap = new TreeMap<>();
//        friendTreeMap.put(new Aka("petya", 25), new Friend("shasha", "petya"));
//        friendTreeMap.put(new Aka("borya", 24), new Friend("shasha", "borisov"));
//        friendTreeMap.put(new Aka("baklan", 22), new Friend("anton", "asdqwe"));
//
//        System.out.println(friendTreeMap);


    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Friend {
    String name;
    String surname;
}


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Aka implements Comparable<Aka> {
    String value;
    int yearsOfFriendship;

    @Override
    public int compareTo(Aka o) {
        return this.yearsOfFriendship - o.getYearsOfFriendship();
    }
}
