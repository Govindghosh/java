package objectOrientedPrograming.access;

public class ObjectDemo {
    int num;
    String name;

    public ObjectDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, "Govind");
        System.out.println(obj.hashCode());
        ObjectDemo obj1 = new ObjectDemo(34, "Raghav");
        System.out.println(obj1.hashCode());
        if (obj == obj1) {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
        if (obj.equals(obj1)) {
            System.out.println("from .equals yes");
        }else {
            System.out.println("from .equals No");
        }
        System.out.println(obj instanceof  Object);
    }
}
