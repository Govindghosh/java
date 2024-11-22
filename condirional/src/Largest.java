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
        System.out.println("way 1st Largest num is : " + max);
        if (a < b){
            max = b;
        } else {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("way 2nd Largest num is : " + max);
        long maxi = Math.max(c, Math.max(a ,b));
        System.out.println("way 3rd Largest num is : " + maxi);
        in.close();
    }
}
