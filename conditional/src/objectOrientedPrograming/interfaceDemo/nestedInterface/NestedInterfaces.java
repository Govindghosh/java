package objectOrientedPrograming.interfaceDemo.nestedInterface;

public class NestedInterfaces {
    // Nested Interface inside the class
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

// Implementing the nested interface
class NestedInterfacesSecond implements NestedInterfaces.NestedInterface {
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        NestedInterfacesSecond obj = new NestedInterfacesSecond();
        System.out.println(obj.isOdd(5)); // Output: true
        System.out.println(obj.isOdd(10)); // Output: false
    }
}
