final class A{
    
}

// class B extends A{  //The type B cannot subclass the final class AJava(16777529)
    
// }

class Parent{
    Parent(){
        System.out.println("call parent class constructor");
    }
    // int a;
    // void m1(){
    //     System.out.println("call parent class m1 method");
    // }
}

class Child extends Parent{
    Child(){

        System.out.println("call child class constructor");
    }
    int a = 10;
    int b;
    void m11(){
        System.out.println("call child class m1 method");
    }
    void m2(){
        System.out.println("call child class m2 method");
    }
}

class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal info
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    // Method to display dog info
    public void displayInfo() {
        // super.displayInfo(); // Call the method from the superclass
        System.out.println("Dog Breed: " + breed);
    }

    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}


public class Inheritance extends Child {

    // Constructor
    // public Inheritance(String name, int age) {
    //     // super(name, age);
    // }

    public static void main(String[] args) throws Exception {
        // Inheritance obj = new Inheritance("Animal", 5);
        // System.out.println("Inheritance example");
        // // Create an object of the subclass
        // Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        // dog.displayInfo(); // Call the method from the subclass
        // dog.bark(); // Call the method from the subclass

        Child obj2 = new Child();
        System.out.println(obj2.a);
        obj2.m2();
    }
}
/*
5 type of inheritance in JAVA
why multiple inheritance not support in java
It's generate ambiguity problem


Singe
Multilevel
Hierarchy

Multiple
Hybrid  =  multiple + Hierarchy


How to prevent inheritance
using final keyword
if we declaring class with final modifier then child class create nor possible

How to access and prevent parent class members?
variable, method, constructor, instance block, static block
*/