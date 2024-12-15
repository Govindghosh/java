package function;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find IsPrime :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        boolean ans1 = isArmStrong(n);
        System.out.println(ans1);
        in.close();
        for (int i=100; i<10000; i++){
            if(isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
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
    // print armStrong number
    static boolean isArmStrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
