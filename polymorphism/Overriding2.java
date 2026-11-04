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

*/

// if class define as final then it cannot be inherited
// final class Animal {
class Animal {
    void sound1() {
        System.out.println("Animal makes a sound");
    }
}
class Dog {
    protected void sound() {
        System.out.println("Dog barks");
    }
    static void color() {
        System.out.println("This is a color method in the Dog class.");
    }

    private void description() {
        System.out.println("This is a color method in the Dog class.");
    }
}

class Overriding2 extends Dog {
    // @Override
    public void sound() {
        System.out.println("Overriding2 class sound method");
    }

    static void color() {
        System.out.println("This is a color method in the Overriding2 class.");
    }
    public static void main(String[] args) {
        Overriding2 obj = new Overriding2();
        obj.sound();

        Dog obj2 = new Overriding2();
        obj2.sound();
        obj.color(); // This will cause a compile-time error because static methods cannot be overridden.
    }
}