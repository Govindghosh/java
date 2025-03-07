package objectOrientedPrograming.access;
//Access Modifiers in Java
//-----------------------------------
//        1. public    → Accessible everywhere.
//        2. protected → Accessible within the same package and subclasses.
//        3. no modifier (default) → Accessible within the same package only.
//        4. private   → Accessible only within the same class.

public class A {
    private int num;  // Private: Only accessible within class A
    String name;       // Default (no modifier): Accessible within the same package
    protected int[] arr; // Protected: Accessible within the same package & subclasses

    public A(int num) { // Public constructor
        this.num = num;
    }

    public int getNum() { // Public getter method
        return num;
    }

    public void setNum(int num) { // Public setter method
        this.num = num;
    }

    public A(int num, String name) { // Public constructor
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}


//Modifier	Same Class	Same Package	SubClass (Different Package)	World (Different Package, Not SubClass)
//public	✅ Yes	        ✅ Yes	            ✅ Yes	                            ✅ Yes
//protected	✅ Yes	        ✅ Yes	            ✅ Yes (via inheritance)	        ❌ No
//default	✅ Yes	        ✅ Yes	            ❌ No	                            ❌ No
//private	✅ Yes	        ❌ No	            ❌ No	                            ❌ No