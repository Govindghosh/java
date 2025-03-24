package string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println((char)('a' + 3)); // d

        System.out.println("a" + 1); // a1

        System.out.println("Govind" + new ArrayList<>()); // Govind[]
        System.out.println("Govind" + Integer.valueOf(56)); // Govind56
        String ans = Integer.valueOf(56) + "" + new ArrayList<>();
        System.out.println(ans); // 56[]

        System.out.println("a" + 'b'); // ab
    }
}
