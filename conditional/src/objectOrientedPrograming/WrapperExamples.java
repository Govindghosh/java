package objectOrientedPrograming;

import java.lang.Class;
import java.util.Arrays;

public class WrapperExamples {
    public static void main(String[] args) {
        int a =10;
        Integer num = 100;
        num.floatValue();
        System.out.printf("", a);
        final A govind = new A("govind Ghosh");
        System.out.println(govind.name);
        govind.name = "other name"; // you can do modify
        System.out.println(govind.name);
        // when a non primitive is final, you cannot reassign it.
//        govind = new A("new obj");
//        final int bonus = 10;
//        bonus = 30;   // can not modify
    }
    static class A{
        final int num = 10;
        String name;

        A(String name){
            this.name = name;

        }
    }

}
