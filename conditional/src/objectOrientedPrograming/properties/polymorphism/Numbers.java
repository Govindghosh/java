package objectOrientedPrograming.properties.polymorphism;

public class Numbers {
    int sum (int a, int b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
    int sum(int a, String b) {
        return a + Integer.parseInt(b);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));      // Output: 5
        System.out.println(obj.sum(2, "3"));    // Output: 5
        System.out.println(obj.sum(1, 2, 3));   // Output: 6
    }
}
