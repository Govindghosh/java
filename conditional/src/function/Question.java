package function;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find IsPrime :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        in.close();
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
