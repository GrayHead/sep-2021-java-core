package lessons.lesson4;

public class Main {
    public static void main(String[] args) {
//        fn interfaces + stream + exceptions + sort

//        System.out.println("start");
//        try {
//            System.out.println(10 / 0);
//            int[] ints = {1, 2, 3};
//            System.out.println(ints[10]);
//
//
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            exception.printStackTrace();
//        } catch (ArithmeticException arithmeticException) {
//            arithmeticException.printStackTrace();
//            // log to file
//
//        } finally {
//            // log to file
//        }
//        System.out.println("end");


        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }


    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a / b);

    }
}
