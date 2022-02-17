package lessons.lesson2.demo1;

// static final  var   extends final methods class inteface abstract classes
public class Main {
    public static void main(String[] args) {


//        User user = new User();
//        user.greeting();
//        User.greeting();
//        System.out.println(User.name);

//        Constants.DAYS = 13;

    }
}

class User {
    private int id;

    static String name = "vasya";

    public static void greeting() {
        System.out.println("hello my name is - " + name);
//        System.out.println("hello my name is - ????");
    }

}

class Constants {
    public static double PI = 3.14;
    public static final double E = 2.7;
    public static final int DAYS = 365;

}


