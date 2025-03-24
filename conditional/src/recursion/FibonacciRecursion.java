package recursion;

import java.util.Scanner;

public class FibonacciRecursion {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter you which fibonacci need: ");
    int num = in.nextInt();
    int ans = fibo(num);
    System.out.println("My Fibonacci number is :" + ans);
}
static int fibo(int n){
    if(n < 2){
        return n;
    }
    return fibo(n - 1) + fibo(n - 2);
}
}