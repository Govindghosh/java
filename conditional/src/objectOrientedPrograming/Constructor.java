package objectOrientedPrograming;

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student("Govind Ghosh", 101, 95.5f);
        System.out.printf("Name: %s, Roll No: %d, Marks: %.1f%n", student.name, student.rollNo, student.marks);
        student.changeName("Raghav");
        System.out.println();
        System.out.printf("Name: %s, Roll No: %d, Marks: %.1f%n", student.name, student.rollNo, student.marks);
    }

    static class Student {
        String name;
        int rollNo;
        float marks;

        // Constructor to initialize the fields
        Student(String name, int rollNo, float marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        // Method to change the name
        void changeName(String name) {
            this.name = name;
        }
    }
}
