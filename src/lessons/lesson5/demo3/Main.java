package lessons.lesson5.demo3;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        id      name
//        1      vasya - USER
//        two    petya - USER ???


        User<Integer> vaysa = new User<>(1, "vaysa");
        User<String> petya = new User<>("2", "petya");

    }
}


class User<X> {
    private X id;
    private String name;

    public User() {
    }

    public User(X id, String name) {
        this.id = id;
        this.name = name;
    }

    public X getId() {
        return id;
    }

    public void setId(X id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
