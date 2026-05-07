package polymorphism;
// Run time polymorphism
// Method Overriding: Subclass provides a specific implementation of a method that is already defined in its superclass. The method in the subclass should have the same name, return type, and parameters as the method in the superclass. The overridden method in the subclass is called at runtime based on the object type, not the reference type.
// Overriding required two classes

// covariant return type concept in java

//Overriding means in parent class method is defined and in child class method is implement
// Overloading have 8 rules
/*
Parent class method signature and child class method signature must be same
Parent class method return type and child class method return type must be same at permeative level
it possible to change return type at class level but not at permeative level  (covariant return type)
if method is final then it cannot be overridden
if method is static then it cannot be overridden but it can be redefined
if method is private then it cannot be overridden but it can be redefined

not possible to decrease the permission in java
protected > default > private > public
protected method can be overridden with protected or public but not with private or default
default method can be overridden with default or public but not with private or protected
private method can be overridden with private or public but not with protected or default
*/

// if class define as final then it cannot be inherited
// final class Animal {
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Base { // overriding class

    // if variable define as final then it cannot be reassigned
    final String name = "Base class";
    void display() {
        System.out.println("Base class display method");
    }
    Animal animalSound(){
        System.out.println("Animal makes a sound");
        return new Animal();
    }
    int empAge(int age){
        return age;
    }

    final void finalMethod() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

public class Overriding extends Base { // Override class
    @Override
    void display() {
        System.out.println("Overriding class display method");
    }
    void childDisplay() {
        System.out.println("Child class method");
    }
    Dog animalSound(){
        System.out.println("Dog makes a sound");
        return new Dog();
    }
    // float empAge(int age){    // its showing error because return type is different from parent class method
    //     return (float) age;
    // }

    // final method overriding is not possible
    // final void finalMethod() {
    //     System.out.println("This is a final method and cannot be overridden.");
    // }

    public static void main(String[] args) {
        Base b = new Base();
        Overriding d = new Overriding();
        Base bd = new Overriding(); // Upcasting
        // Overriding child = new Base(); // error  child class reference cannot refer to parent class object

        b.display(); // Output: Base class display method
        d.display(); // Output: Overriding class display method
        bd.display(); // Output: Overriding class display method (runtime polymorphism)

        //compile time checking childDisplay() method is present in parent class reference or not
        // bd.childDisplay(); // error because childDisplay() is not defined in Base class reference
        Overriding child = (Overriding) bd; // Downcasting
        child.childDisplay(); // Output: Child class method
        System.out.println("Base class age: " + b.empAge(30)); // Output: Base class age: 30
        System.out.println("Overriding class age: " + d.empAge(35)); // Output: Overriding class age: 30.5
        System.out.println("Upcasting age: " + bd.empAge( 25)); // Output

    }
}
