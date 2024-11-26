import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for loop
        // syntax of for loop
//        for (initialisation; condition; increment/decrement) {
//            body
//        }
        for (int num = 1; num<=5; num++){
            System.out.println(num);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("For loop");
        System.out.print("Please enter end num : ");
        int n = in.nextInt();
        for(int num1=1; num1<=n; num1++){
            System.out.println(num1);
        }
        // While loop
        // while loop syntax

//        while(){
//
//        }
        // convert for loop in while loop
        System.out.println("While loop");
        System.out.print("Please enter a num value : ");
        int num2 = in.nextInt();
        System.out.print("Please enter your end value : ");
        int n1 = in.nextInt();
        while (num2 <= n1){
            System.out.println("num "+ num2);
            num2++;
        }
        // do while loop
//        syntax
//                do{
//                    body
//                }while(condition);
        System.out.println("Do while loop");
        System.out.print("Please enter num value : ");
        int num3 = in.nextInt();
        System.out.print("Please enter end value : ");
        int n3 = in.nextInt();
        do {
            System.out.println("working time : " + num3);
            num3++;
        } while(num3 <= n3);
        in.close();
    }
}
