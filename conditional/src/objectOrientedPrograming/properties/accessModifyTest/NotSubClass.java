package objectOrientedPrograming.properties.accessModifyTest;

public class NotSubClass {
    public static void main(String[] args) {
//        A obj = new A(30, "John"); // Cannot access protected and private members directly
        // obj.num = 50;  // ❌ Cannot access private member outside class A
        // obj.arr = new int[10]; // ❌ Cannot access protected member outside subclass
        // obj.name = "Updated"; // ❌ Cannot access default member in a different package
    }
}
