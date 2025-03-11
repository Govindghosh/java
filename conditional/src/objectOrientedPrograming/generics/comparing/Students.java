package objectOrientedPrograming.generics.comparing;

public class Students implements Comparable<Students> {
    private int rollNo;
    private float marks;

    public Students(float marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Students o) {
        // Proper comparison without casting to int
        return Float.compare(this.marks, o.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
