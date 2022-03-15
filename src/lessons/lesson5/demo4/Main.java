package lessons.lesson5.demo4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {


//        Class<Car> carClass = Car.class;

//        Car car = new Car(1, "porsche");
//        Class<? extends Car> aCar = car.getClass();
//        Field[] declaredFields = aCar.getDeclaredFields();
//
////        System.out.println(car);
////        for (Field field : declaredFields) {
////            System.out.println(field.getType());
////            System.out.println(field.getName());
////            field.setAccessible(true);
////            System.out.println(field.get(car));
////            if (field.getType().getName().equals("int")) {
////                field.set(car, 100500);
////            }
////        }
////        System.out.println(car);
//
//
//        Method[] methods = aCar.getDeclaredMethods();
//
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println(method.getParameterCount());
//            Parameter[] parameters = method.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getType());
//                System.out.println(parameter.getName());
//            }
//
//            System.out.println("-------------");
//        }


        Car car = new Car(1, "asgfqwe");
        handler(car);

    }

    public static void handler(Car car) throws IllegalAccessException {
        Class<? extends Car> carClass = car.getClass();
        Field[] fields = carClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Validate.class)) {
                field.setAccessible(true);
                int id = (int) field.get(car);
                if (id < 1) {
                    System.out.println("asfdahsfdhafsdhgafs!!!!");
                }


            }
        }


    }
}


