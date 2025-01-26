package objectOrientedPrograming;


public class Class {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Govind Ghosh";
        student.rollNo = 101;
        student.marks = 95.5f;
        System.out.println(String.format("Your name is %s, your roll no is %d, and your marks are %.1f", student.name, student.rollNo, student.marks));
    }
    // create student class
    static class Student{
        String name;
        int rollNo;
        float marks;
    }
}
