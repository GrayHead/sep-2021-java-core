package lessons.lesson1.demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

//        byte b = 127;
//        System.out.println(b);
//        short sh = 32000;
//        System.out.println(sh);
//        int num = 100;
//        System.out.println(num);
//        long lg = 32165498798L;
//        System.out.println(lg);

//        float fl = 3.14f;

        double db = 3.14;
        boolean b1 = true;
        boolean b2 = false;
        b2 = true;

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello2";
        String str4 = "hello2";

        char ch = 'Z';
        System.out.println(ch);

        int[] numbers = new int[3];
        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 33;
        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//
//        }


        for (int number : numbers) {
            System.out.println(number);
        }

        // > < >= <= == != .equals()
        // + - * / %  i++ i-- --i ++i i+=1 i=i+1

//        String[] strings = {"asdasd", "asdasd", "asdytasytdf"};
//        strings[2] = "foobar";

        ArrayList<String> strings = new ArrayList<>();
        strings.add("asdfahsg-1");
        strings.add("asdfahsg0");
        strings.add("asdfahsg1");
        strings.add("asdfahsg2");
        strings.add("asdfahsg3");
        System.out.println(strings);
        System.out.println(strings.get(0));

        for (String string : strings) {

        }

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

        }


    }
}
