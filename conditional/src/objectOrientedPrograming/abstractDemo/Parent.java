package objectOrientedPrograming.abstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    //abstract static void career(); // ❌ Not allowed (static + abstract)
    // ✅ Static method in abstract class (Allowed)
    static void hello() {
        System.out.println("Hello from Parent class!");
    }

    abstract void career();
    abstract void partner();
}
//Feature	                                Allowed in Abstract Class?
//static abstract method	                ❌ Not allowed
//static method in abstract class	        ✅ Allowed
//static method calling abstract method	    ❌ Not allowed
//static variable in abstract class	        ✅ Allowed

//Feature	                                Allowed in Abstract Class?
//final abstract method	                    ❌ Not allowed
//final abstract class	                    ❌ Not allowed
//final method in abstract class	        ✅ Allowed
//final variable in abstract class	        ✅ Allowed