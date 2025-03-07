package objectOrientedPrograming.properties.accessModifyTest;

import objectOrientedPrograming.access.A;

// SubClass in a Different Package
public class SubClass extends A {
    public SubClass(int num) {
        super(num); // Can access public constructor
    }

    public SubClass(int num, String name) {
        super(num, name); // Can access public constructor
    }
}

