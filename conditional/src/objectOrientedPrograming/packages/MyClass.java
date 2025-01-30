package objectOrientedPrograming.packages;

import static objectOrientedPrograming.packages.Packages.showMessage;

public class MyClass {
    public static void main(String[] args) {
        MyInnerClass myInnerClass = new MyInnerClass("Govind");

        showMessage(myInnerClass.name);
    }

    static class MyInnerClass {
        String name;

        public MyInnerClass(String name) {
            this.name = name;
        }
    }
}
