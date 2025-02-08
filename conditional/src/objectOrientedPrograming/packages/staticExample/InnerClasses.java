package objectOrientedPrograming.packages.staticExample;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Test test0 = new Test("Govind");
        System.out.println(test0);
    }
}
