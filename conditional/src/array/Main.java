package array;

public class Main {
    public static void main(String[] args) {
        //Q: why we need array
        // store a roll number
        int a = 22;
        // how to store many roll number
        //?
        // like this
//        int a1 =23;
//        int a2 = 24;
//        int a3 =25;
//        int a4 =26;
//        int a5 = 27;
//        int a6 =28;
        // this is very bad thing
        // syntax look
        // datatype[] varriable_name = new datatype[size]
        // store 5 roll num
        int[] rollnum = new int[5];
        // or directly
        int[] rollnum1 = {23,24,25,26,27,28};
        // int[] rollnum; decleartion of arry. rollnum is getting defined in the stack
        // rollnum = new int[5] initilisation : actually here the object is being created in the heap
//        1- array object are in heap
//        2- heap object are , not continuos
//        3- dynimic memory allocation
//        4 - array store in continuos but java may not be continuos reason JVM
//        5- array start with 0 example
        // new is used to create a object
        System.out.println(rollnum[1]); // output 0
        //String
        String[] strArr = new String[4];
        System.out.println(strArr[2]); // output is null

    }
}
