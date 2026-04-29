// file name: Main.java 
class Base {
    String name = "Smith";
    int age = 1000;
    protected int i = 11;
    {
        System.out.println("call base class instance block");
    }
    static void display1() {
        System.out.println("Base class static method called"); 
    }
    /*static {
        System.out.println("call base class static block");
    }*/
    protected void foo() {
        System.out.println("Base foo() called " + i); 
    } 
    public void foo(int i) {
        System.out.println("Base foo(int) called " + i); 
    }
}  
class Derived extends Base { 
    int i = 22;
    int age=40;
    {
        System.out.println("call derived class");
    }
    static void display() {
        System.out.println("Derived class static method called"); 
    }
    /*static {
        System.out.println("call derived class static block");
    }*/
    protected void foo() {
        final int i = 33;
        System.out.println("Derived foo(int) called " + i); 
    } 
    public void foo(double i) {
        System.out.println("Derived foo(double) called " + i); 
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return super.age;
    }
}  
public class Main extends Derived { 
    public static void doPrint(Base o){
        o.foo();
    }
    /*public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    public static void gfg(Integer i) 
    { 
        System.out.println("Integer"); 
    } */
    public static void main(String args[]) { 
        // new Derived();
        // gfg(null);
        Base b = new Base();
        // Derived bd = new Base();
        Base db = new Derived();
        Derived d = new Derived();
        // System.out.println(db.getAge()); //error
        System.out.println(d.getAge());
        System.out.println(d.getName());
        // b.display1();
        // db.display1();
        // d.display1();
        // db.display();  // error
        // d.display();
        // doPrint(db);
        // doPrint(b);
        // doPrint(d);
        // b.foo();
        // b.foo(5);
        // d.foo(5.3);
        /*db.foo();
        b.foo();
        System.out.println(b.i);
        d.foo();
        System.out.println(d.i);*/
        // Main m = new Main(); 
        // m.foo();
        // System.out.println(m.i);
        /*byte s = 127;
        long l = 4;
        s += l;
        System.out.println(s);
        System.out.println(s + l); // -125
        */

    } 
} 
