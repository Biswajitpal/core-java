package polymorphism;

/*
Abstract class may contain abstract method or may not contain abstract method but object creation is not possible of abstract class but reference variable can be created of abstract class

two type of method in java normal method and abstract method

if class contain at list one abstract method then that class is called abstract class
abstract method is a method which is declared without implementation (without body)
abstract method is declared using the abstract keyword and does not have a body. It is meant to be overridden by subclasses to provide specific implementations.
abstract class cannot be instantiated, but it can be subclassed. A subclass of an abstract class must provide implementations for all abstract methods of the superclass, unless the subclass is also declared as abstract. 

abstract class object creation not possible but reference variable can be created
abstract class can have constructor but it cannot be used to create object of abstract class but it can be used to initialize the instance variables of abstract class when a subclass object is created
abstract class can have static method, final method, and non-abstract method with body
abstract class can have static block and instance block
abstract class can have final variable but it must be initialized at the time of declaration or in the constructor of abstract class
abstract class can have main method and it can be executed
abstract class can have static variable and it can be accessed by using class name
abstract class can have instance variable and it can be accessed by using object reference variable
abstract class can have abstract method and it must be overridden by subclass
abstract class can have multiple constructors but it cannot be used to create object of abstract class but it can be used to initialize the instance variables of abstract class when a subclass object is created
abstract class can have multiple static method and it can be accessed by using class name
abstract class can have multiple final method and it cannot be overridden by subclass
abstract class can have multiple non-abstract method with body and it can be accessed by using object reference variable
abstract class can have multiple static block and instance block
abstract class can have multiple final variable but it must be initialized at the time of declaration or in the constructor of abstract class
abstract class can have multiple main method and it can be executed

*/
abstract class InnerTestAbstraction {

    abstract void m1(); // abstract method
    abstract void m2(); // abstract method

    void m3() { // non-abstract method with body
        System.out.println("This is a non-abstract method in the InnerTestAbstraction class.");
    }
}

class TestAbstraction extends InnerTestAbstraction {

    void m1() {
        System.out.println("This is a non-abstract method in the TestAbstraction class.");
    }
    void m2() {
        System.out.println("This is another non-abstract method in the TestAbstraction class.");
    }
    public static void main(String[] args) {
        // Animal obj = new Animal(); // This will cause a compile-time error because we cannot instantiate an abstract class.
        // Dog obj = new Dog();
        // obj.sound();
        TestAbstraction obj2 = new TestAbstraction();
        InnerTestAbstraction obj3 = new TestAbstraction(); // Upcasting: Reference variable of abstract class can refer to an object of subclass
        // obj2.m1();
        // obj2.m2();
        // obj2.m3();


        obj3.m1();
        obj3.m3();

        // new InnerTestAbstraction(); // This will cause a compile-time error because we cannot instantiate an abstract class.
    }
}