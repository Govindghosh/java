package objectOrientedPrograming.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Students govind = new Students(96.5645f, 1);
        Students raghav = new Students(90.5645f, 2);

        if (govind.compareTo(raghav) > 0) {
            System.out.println("Govind has more marks");
        } else if (govind.compareTo(raghav) < 0) {
            System.out.println("Raghav has more marks");
        } else {
            System.out.println("Both have equal marks");
        }
        Students[] list = {govind, raghav};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return (int)(o1.getMarks() - o2.getMarks());
            }
        });
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return (int)(o1.getRollNo() - o2.getRollNo());
            }
        });
        System.out.println(Arrays.toString(list));
        //lambda
        Arrays.sort(list, (o1, o2) -> (int) (o1.getRollNo() - o2.getRollNo()));

    }
}

