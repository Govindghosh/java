package objectOrientedPrograming;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        // store 5roll no.
        int[] rollNo = new int[5];
        // store 5 names
        String[] names = new String[5];
        // data store 5 student {rollNumber, name, marks}
        int[] rollNumber = new int[5];
        String[] name = new String[5];
        int[] marks = new int[5];

        //Student[] students = new Student[5];
        //System.out.println(Arrays.toString(students)); // null
        Student govind = new Student();
        govind.rollNo = 101;
        govind.name = "Govind Ghosh";
        govind.marks = 95.5f;
        System.out.println(govind.rollNo);
        System.out.println(govind.name);
        System.out.println(govind.marks);
    }
    // create class
    static class Student{
        int rollNo;
        String name;
        Float marks;
    }
}
