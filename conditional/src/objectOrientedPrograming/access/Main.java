package objectOrientedPrograming.access;


public class Main {
    public static void main(String[] args) {
        A obj = new A(20, "Govind");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members
        // onj.num(); // can not access because of member is private
        // Accessing data members:
        // obj.num = 100; ❌ Cannot access private field
        obj.setNum(100); // ✅ Allowed via public setter method

         obj.name = "NewName"; //✅ Allowed (default access, same package)
    }
}
