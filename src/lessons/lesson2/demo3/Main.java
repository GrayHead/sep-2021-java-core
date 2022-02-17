package lessons.lesson2.demo3;
// static final  var   extends ovverride final methods class abstract classes inteface

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();

//        Animal
//    Dog      Cat


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        Dog dog = (Dog) animals.get(0);// dog
        dog.bark();

//        Animal cat = animals.get(1); // cat
//        cat.


    }
}

