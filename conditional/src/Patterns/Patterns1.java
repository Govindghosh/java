package Patterns;

public class Patterns1 {
    public static void main(String[] args) {
//        NOTE:
//        row and col
//        *
//        **
//        ***
//        ****
//        How to approch
//        1. here row is 4
//         and the hightest col is 4
//        2. no. of lines = no. of row = no. of time outer loop will run
//        3. identify for every row no.,
//                how many cols are there
//                types of elements in the col
//        4. what do you need to print
        System.out.println("another pattern1");
        patternOne(5);
        System.out.println("another pattern2");
        patternTwo(5);
        System.out.println("another pattern3");
        patternThree(5);
        System.out.println("another pattern4");
        patternFour(5);
        System.out.println("another pattern5");
        patternFive(5);
        System.out.println("another pattern28");
        patterntwentyEight(5);
        System.out.println("another pattern30");
        patternThirty(5);
    }
    static void patternOne(int n) {
        for (int row = 0; row < n; row++) {
            // For every row, run the columns
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }

    static void patternTwo(int n) {
        for (int row = 0; row < n; row++) {
            // For every row, run the columns
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }

    static void patternThree(int n) {
        for (int row = 0; row < n; row++) {
            // For every row, run the columns
            for (int col = 0; col < n - row; col++) { //  Corrected logic to reduce the columns
                System.out.print("* ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }
    static void patternFour(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, run the columns
            for (int col = 0; col < row; col++) {
                System.out.print(col+1 + " ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }
    static void patternFive(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            // For every row, run the columns
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }
    static void patterntwentyEight(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            // For every row, run the columns
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }
    static void patternThirty(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            // For every row, run the columns
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            // When one row is printed, add a newline
            System.out.println();
        }
    }
}
