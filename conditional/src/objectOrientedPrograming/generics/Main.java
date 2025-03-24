package objectOrientedPrograming.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Added 45: " + list.add(45));  // true
        System.out.println("Removed index 0: " + list.remove(0));

        // Avoid get(0) on an empty list
        if (!list.isEmpty()) {
            System.out.println("First element: " + list.get(0));
        } else {
            System.out.println("List is empty, cannot get(0).");
        }

        System.out.println("Added 49: " + list.add(49));
        System.out.println("Current list: " + list);

        // Ensure index 1 exists before setting a value
        if (list.size() > 1) {
            System.out.println("Updated index 1: " + list.set(1, 665));
        } else {
            System.out.println("Index 1 does not exist, adding 665.");
            list.add(665);
        }

        System.out.println("Final List: " + list);
        System.out.println("List Size: " + list.size());
        System.out.println("Is List Empty? " + list.isEmpty());

        System.out.println("----------Custom Generic ArrayList----------");

        CustomArrayList list1 = new CustomArrayList();
        list1.add(6);
        list1.add(9);
        list1.add(10);
        list1.remove();
        list1.add(12);

        if (list1.size() > 2) {
            System.out.println("Element at index 2: " + list1.get(2));
        } else {
            System.out.println("Index 2 is out of bounds.");
        }

        System.out.println("Size: " + list1.size());
        System.out.println("Set index 1 to 65: " + list1.set(1, 65));
        System.out.println(list1.toString());

        System.out.println("\n----------Generics Example----------");

        ArrayList<Integer> list2 = new ArrayList<>();
        // Type safety ensures no string can be added to list2
        // list2.add("vdgjvc");  // ❌ Compilation error

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Govind");
        System.out.println(list3.toString());
        System.out.println("\n----------------CustomGenericArrayList<string>----------------");
        CustomGenericArrayList<String> stringList = new CustomGenericArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList);
        System.out.println("Removed: " + stringList.remove());
        System.out.println(stringList);

        System.out.println("\n----------------CustomGenericArrayList<Integer>----------------");
        CustomGenericArrayList<Integer> intList = new CustomGenericArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList);
        System.out.println("Removed: " + intList.remove());
        System.out.println(intList);
    }

}
