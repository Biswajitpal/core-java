class Area{
    static void area(){
        System.out.println("Area of circle is 3.14 * r * r");
    }
    void length(){
        System.out.println("Length of rectangle is 2 * (l + b)");
    }
}

public class HelloWorld {
    public static void f1(){
        System.out.println("call f1");
    }
    void f2(String str){
        System.out.println("call f2"+str);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        f1();
        new HelloWorld().f2("f2");
        new HelloWorld().f2("new f2");
        Area.area();  // static method call without creating object
        Area obj = new Area(); // creating object of class Area
        obj.length(); // non static method call using object
    }
}