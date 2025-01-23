package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Govind";
        String b = "Govind";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Govind");
        String name2 = new String("Govind");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
