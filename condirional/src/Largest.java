import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 3 value to find One : ");
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long max = a;
        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.print("Largest num is : " + max);
        in.close();
    }
}
