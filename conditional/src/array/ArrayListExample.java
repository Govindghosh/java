package array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //calling InputIntegerList
        ArrayList<Integer> result = InputIntegerList();
        System.out.println("User Input List: " + result);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(12);
        list.add(50);
        list.add(60);
        list.add(10);
        list.add(963);
        list.add(78);
        list.add(87);
        list.add(98);
        //initial Capacity not matter
        System.out.println(list); // output [12, 50, 60, 10, 963, 78, 87, 98]
        // list have True or False
        System.out.println(list.contains(32)); // output false
        // list to get value with mention of index and it give a return
        Integer i = list.get(5); // output 78
        System.out.println(i);
        // set change the value provide index and value it will change the array
        Integer i1 = list.set(1, 55);
        System.out.println("i1 " + i1); // output i1 50
        System.out.println(list); //output [12, 55, 60, 10, 963, 78, 87, 98]
        // remove by index
        list.remove(3); // output [12, 55, 60, 963, 78, 87, 98]
        System.out.println(list); // output [12, 55, 60, 963, 78, 87, 98]
        // clear the arrays
        list.clear(); // output []
        System.out.println(list);


    }
    static ArrayList<Integer> InputIntegerList() {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        // Input 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        // get item at any index using for loop
        for (int i = 0; i < 10; i++) {
            Integer getList = list.get(i);
            System.out.println("getList from for loop" + getList);

        }
        // Close the Scanner to avoid resource leaks
        in.close();

        // Return the populated list
        return list;
    }
}
