package objectOrientedPrograming.properties.multipleInheritance;

public class MultipleInheritance {
    // not allow in java
//    This ambiguity is why Java only allows single inheritance with classes but supports multiple inheritance through interfaces. 🚀
}
class A {
    void show() {
        System.out.println("Show from A");
    }
}

class B {
    void show() {
        System.out.println("Show from B");
    }
}

// ❌ This would cause ambiguity if Java allowed multiple inheritance
//class C extends A, B { // Not allowed
//}
