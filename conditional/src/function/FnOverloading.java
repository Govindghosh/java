package function;

public class FnOverloading {
    public static void main(String[] args) {
        // if the fn name same even the retrub type also same but the argument are different even we pass 2 argument is called fn overloading ex-
        fun("govind");
        fun(25);
        // output govind second line 25
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
