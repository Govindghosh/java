package objectOrientedPrograming.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Calling the parameterized constructor of Box
        Box box1 = new Box(10, 20, 30);
        System.out.println("Box1 dimensions: "
                //+ box1.len + " x "
                + box1.width + " x "
                + box1.hei);

        // Calling the default constructor of Box
        Box box2 = new Box();
        System.out.println("Box2 dimensions (default): "
               // + box2.len + " x "
                + box2.width + " x "
                + box2.hei);

        // Calling the constructor that initializes a cube (all sides equal)
        Box box3 = new Box(15);
        System.out.println("Box3 dimensions (cube): "
                //+ box3.len + " x "
                + box3.width + " x "
                + box3.hei);

        // Copy constructor: Creates a new Box using an existing Box object
        Box box4 = new Box(box1);
        System.out.println("Box4 dimensions (copied from box1): "
               // + box4.len + " x "
                + box4.width + " x "
                + box4.hei);

        // Calling the static method from Box class
        Box.greeting(); // This should print a greeting message

        // ------------------ INHERITANCE SECTION ------------------

        // Creating an instance of BoxWeigh using the constructor with only weight
        BoxWeigh box5 = new BoxWeigh(30);
        System.out.println("Box5 weight: " + box5.weigh);

        // The following lines might cause errors if BoxWeigh doesn't inherit these properties properly
        System.out.println("Box5 height: " + box5.hei); // Will work only if 'hei' is public or has a getter
        //System.out.println("Box5 length: " + box5.len); // Same condition applies // error reason len private
        System.out.println("Box5 width: " + box5.width); // Same condition applies

        // Creating an instance of BoxWeigh using all parameters (length, width, height, weight)
        BoxWeigh box6 = new BoxWeigh(12, 30, 60, 100);

        // Printing the box6 object directly (Make sure BoxWeigh overrides toString() method for meaningful output)
        System.out.println(box6.toString());
        Box box7 = new Box(4.6,7.7,8.8);
        // Box is parent you can not access weigh
        // box7.weigh // error

        // example reference variable and object not same, we made parent var and child object
        // we can't access child properties like weigh
        // this is reference type of Box(parent) and Box referring type BoxWeigh
        Box box8 = new BoxWeigh(10,40,60,1000);
        //System.out.println(box8.weigh); // we can't access child properties like weigh
        // child to parent
        // explanation you are given access to variable that are in the ref i.e BoxWeigh
        // hence, you should have access to weight variable
       // BoxWeigh box9 = new Box(10,40,60);
        //System.out.println(box9.weigh);
    }
}
