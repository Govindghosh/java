package objectOrientedPrograming;

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student("Govind Ghosh", 101, 95.5f);
        System.out.println(String.format("Name: %s, Roll No: %d, Marks: %.1f", student.name, student.rollNo, student.marks));
    }
    static class Student{
        String name;
        int rollNo;
        float marks;
        // Constructor to initialize the fields
        Student(String name, int rollNo, float marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }
    }
}
