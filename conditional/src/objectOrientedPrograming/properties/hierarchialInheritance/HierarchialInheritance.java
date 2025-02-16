package objectOrientedPrograming.properties.hierarchialInheritance;
//Hierarchical inheritance is a type of inheritance where multiple child classes inherit from a single parent class.
// This means that one base class (parent) is shared by multiple derived classes (children).


public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog's own method

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Cat's own method
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}