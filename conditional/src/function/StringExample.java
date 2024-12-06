package function;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){

            System.out.print("Please enter your name : ");
            String name = in.nextLine();

            if (name.isEmpty()){
                System.out.println("Name cannot empty");
            }else {
                String greeting = myGreet(name);
                System.out.println(greeting);
                break;
            }

        }
        in.close();
    }
    static String myGreet(String name){
        return "Hello " + name + ", welcome to the program!";

    }
}
