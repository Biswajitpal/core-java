package polymorphism;
class Polymorphism {
    // What is Polymorphism?
    // Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables
    // Constructor Overloading: Same constructor name with different parameters or same number of parameters but different types
    Polymorphism(){
        System.out.println("Constructor method");
    }
    Polymorphism(int a){
        System.out.println("Constructor method with 1 arg: "+a);
    }
    Polymorphism(boolean isValid){
        System.out.println("Constructor method with 1 arg: "+isValid);
    }

    // Method Overloading: Same method name with different parameters
    void m1(int a){
        System.out.println("1 arg method: "+a);
    }
    int m2(int a, int b){
        System.out.println("2 args method: "+ (a+b));  // example of operator overloading
        return a + b;
    }
    final void m3(char c){
        System.out.println("1 char method: "+c);
    }

    //Operator Overloading: One operator with different behavior (not supported in Java)
    // In Java, we cannot overload operators like +, -, *, etc. for user-defined classes. However, we can achieve similar functionality by defining methods that perform operations on objects of the class.
    // For example, we can define a method to add two objects of a class:   
    public static void main(String [] args){
        Polymorphism obj = new Polymorphism();
        new Polymorphism(10);
        new Polymorphism(true);
        obj.m1(10);
        int result = obj.m2(20, 30);
        System.out.println("Result of m2: " + result);
        obj.m3('A');
    }
}