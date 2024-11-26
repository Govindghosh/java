import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci");
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();
        int preValue = 0;
        int nextValue = 1;
        int count = 2;

        while (count < n) {
            int temp = nextValue;
            nextValue = nextValue + preValue;
            preValue = temp;
            count++;
        }
        System.out.println("Fibonacci number at position " + n + " is: " + nextValue);
        // find how many times
        System.out.println("We find repeat number");
        System.out.print("please provide a long number : ");
        long a1 = in.nextLong();
        int count1 = 0;
        System.out.print("please provide repeated number : ");
        int repeatNumber = in.nextInt();
        while(a1 > 0){
            long rem = a1 % 10;
            if (rem == repeatNumber){
                count1++;
            }
            a1 = a1 / 10;
        }
        System.out.println("repeat time " + count1);

        //swap to right to left
        System.out.println("swap to right to left");
        System.out.print("Please provide a long number to swap : ");
        long swap = in.nextLong();
        long rev = 0;
        while (swap > (int)(0)){
            long rem = swap % 10;
            swap = swap / 10;
            rev = rev * 10 + rem;

        }
        System.out.println("Reversed number: " + rev);
        in.close();
    }
}
