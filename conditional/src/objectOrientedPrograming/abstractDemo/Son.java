package objectOrientedPrograming.abstractDemo;

public class Son extends Parent {
//    public Son(int age) {
//        this.age = age;
//    }

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Ironman");
    }
}
