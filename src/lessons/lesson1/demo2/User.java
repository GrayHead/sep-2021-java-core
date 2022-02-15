package lessons.lesson1.demo2;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"id"})
public class User {

    private int id;
    private String name;
    private int age;
    private boolean status;
    private ArrayList<String> skills = new ArrayList<>();
    private Address address;
    private Gender gender;


}
