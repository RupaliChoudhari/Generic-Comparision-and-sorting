package com.object.lambda;
import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        list.forEach((item) -> System.out.println(item));
    /*
     Consumer<Integer> con= (item)-> System.out.println(item);
     arr.forEach(con);
     */

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;


        LambdaExample cal = new LambdaExample();
        System.out.println("sum : " + cal.operate(5, 6, sum));
        System.out.println("multiply : " +cal.operate(5, 6, mul));
        System.out.println("difference : " +cal.operate(10, 6, diff));

    }

    private int operate(int aa, int bb, Operation op) {
        return op.operation(aa, bb);
    }

}
    interface Operation{
        public int operation(int a, int b);

       }