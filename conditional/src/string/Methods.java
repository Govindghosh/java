package string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Govind Ghosh Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('o'));
        System.out.println("     Govind   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
