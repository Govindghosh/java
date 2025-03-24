package recursion;

public class Message {
    public static void main(String[] args) {
        message();
    }

    private static void message() {
        System.out.println("Govind");
        message1();
    }

    private static void message1() {
        System.out.println("Govind");
        message2();
    }

    private static void message2() {
        System.out.println("Govind");
        message3();
    }

    private static void message3() {
        System.out.println("Govind");
        message4();
    }

    private static void message4() {
        System.out.println("Govind");
    }
}
