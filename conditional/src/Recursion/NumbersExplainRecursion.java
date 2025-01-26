package Recursion;

public class NumbersExplainRecursion {
    public static void main(String[] args) {
        print1(1);
    }

    public static void print1(int n) {
        // Base condition to stop recursion
        if (n > 5) {
            return;
        }
        System.out.println(n);
        // Recursive call
        print1(n + 1);
    }
}
