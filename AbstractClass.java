abstract class MyClass{
    private String name;
    private int age;
    abstract void f1();
    MyClass(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("With parameter abstract class constructor called");
    }

    MyClass(){
        System.out.println("Default abstract class constructor called");
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class AbstractClass extends MyClass{
    AbstractClass(String name, int age){
        super(name, age);
    }
    AbstractClass(){
        // super();
        this("Default", 0);
        System.out.println("Default constructor called");
    }
    @Override
    void f1() {
        System.out.println("f1 method implementation in AbstractClass");
    }
    void printName(){
        System.out.println("print name");
    }
    static void f2() {
        System.out.println("f2 method implementation in AbstractClass");
    }
    public static void main(String[] args) {
        // AbstractClass obj = new AbstractClass();
        // obj.f1();
        // obj.display();
        // AbstractClass obj1 = new AbstractClass("John", 25);
        // obj1.display();
        // f2();
        System.out.println('j' + 'a' + 'v' + 'a');
    }
    
    
}
