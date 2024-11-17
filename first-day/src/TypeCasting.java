import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Note
//        1- destination type should greater then that source tpye
//        2- tpye should be compatable
//        3- int is smaller then then float so we can push integer into a float
//        4- in casting data type small and you give big data then the jvm give error, must give a smaller data type
        System.out.println("Write a Number");
        float num = input.nextFloat();
        System.out.println("num " + num);

//        int num1 = input.nextFloat(); // so here we not give nextfloat reason is left (variable) side is int  gives error
        System.out.println("please write a float for error :");
        int num1 = input.nextInt();
        System.out.println("this an int :" + num1);

        // type casting
        // comprasing biger number to smaller num
        System.out.println("give input a float type :");
        float floatNum = input.nextFloat();
        int num2 = (int)(floatNum);
        System.out.println("data type casting :" + num2);

        //automatic type promotion in expressions
        System.out.print("automatic type promotion in expressions :");
        int a = input.nextInt();
        byte b = (byte) (a);
        System.out.print("automatic type promotion in expressions is :" + b);
        System.out.println("New byte to byte ");
        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println("40*50/100 byte to int : " + f);
    }
}
