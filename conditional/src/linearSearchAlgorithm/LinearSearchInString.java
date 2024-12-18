package linearSearchAlgorithm;

import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        // simple stuff
        String name = "Govind";
        char target = 'i';
        boolean ans = linearSearch(name, target);
        System.out.print("Boolean answer " + ans);
        System.out.println();
        String ans1 = linearSearch1(name, target);
        System.out.print("Target value is " + ans1);
        String ans2 = linearSearch2(name, target);
        System.out.println();
        // now we do same thing with using Scanner
        System.out.println("Target index is " + ans2);
        Scanner in = new Scanner(System.in);
        System.out.print("Please provide String : ");
        String str = in.nextLine().replaceAll(" ","");
        System.out.print("Please provide which char : ");
        String target1 = in.next().trim();
        int ans3 = linearSearch3(str, target1);
        System.out.print("Target index is :" + ans3);
    }
    //search the target and return true and False
    static boolean linearSearch(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    //search the target and return Target Value
    static String linearSearch1(String name,char target){
        if (name.isEmpty()){
            return "not Include";
        }
        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if (element == target){
                return String.valueOf(target);
            }
        }
        return "not include";
    }
    //search the target and return Target Index
    static String linearSearch2(String name, char target){
        if (name.isEmpty()){
            return "not found";
        }
        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if (element == target){
                return String.valueOf(i);
            }
        }
        return "no index found";
    }
    //search the target and return Target Index using input
    static int linearSearch3(String str, String target1){
        if (str.isEmpty()){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            String element = String.valueOf(str.charAt(i));
            if(target1.equals(element)){
                return i;
            }
        }
        return -1;
    }
}