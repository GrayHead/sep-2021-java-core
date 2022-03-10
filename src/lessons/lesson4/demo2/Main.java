package lessons.lesson4.demo2;

public class Main {
    public static void main(String[] args) {
        //        fn interfaces + stream + sort


//        FuncInterface1 interface1 = new A();
//        interface1.add(10, 20); // 30
//
//        FuncInterface1 interface12 = new FuncInterface1() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };

//        FuncInterface1 interface1 = (x, y) -> /*return*/ x + y;

//        FuncInterface1 interface1 = (x, y) -> {
//            System.out.println("adsad");
//            return x + y;
//        };

//        FuncInterface1 interface1 = Integer::sum;

    }
}

class A implements FuncInterface1 {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
