package lessons.lesson2.demo4;

import java.util.ArrayList;
// static final  var   extends ovverride final methods class abstract classes inteface (methods static defait) exttend interfaces

public class Main {
    public static void main(String[] args) {
        Policeman policeman = new Policeman(); // Ploiceman Singer Runner
        Student student = new Student(); // Sytudent Singer Runner

        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(student);
        singers.add(policeman);

        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(student);
        runners.add(policeman);


        System.out.println(Singer.x);
        Singer.foo();


        policeman.bar();


        Singer singer = new Singer() {
            @Override
            public void sing() {
                System.out.println("eeeeeooooooooooooooooo!!!!!!!!");
            }
        };


    }
}

interface Singer {
    /*public*/ void sing();

    /*public static final*/ int x = 100;

    static void foo() {
        System.out.println("stuff foo");
    }

    default void bar() {
        System.out.println("stuff bar");
    }


}

interface Runner {
    int run();
}


class Student implements Singer, Runner {
    String words = "ahdfahsgdfh";

    @Override
    public void sing() {
        System.out.println(words);
    }

    @Override
    public int run() {
        return 20;
    }
}

class Policeman implements Singer, Runner {

    private int speed = 30;

    @Override
    public void sing() {
        System.out.println("alalalalala");
    }

    @Override
    public int run() {
        return speed - 2;
    }
}


interface A {
}

interface B extends A {
}

interface C extends B {
}

class X implements C {

}

