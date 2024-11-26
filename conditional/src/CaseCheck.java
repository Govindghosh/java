import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please write text : ");
        char ch = in.next().trim().charAt(0);
        System.out.println("char is : " + ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowerCase");
        } else {
            System.out.println("UpperCase");
        }
    }
}
