final class Demo {
    private int a;
    static int b;
    final private  float test;


    // constructor overloading
    Demo() {
        System.out.println("Default constructor called "+ this.test);
    }
    Demo(int x) {
        this.b = x;
        System.out.println("call on argument constructor with one argument");
    }
    Demo(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println("call on argument constructor with two argument");
    }
    {
        this.test = 10.6f;
        System.out.println("Instance initializer block called");
    }
    static {
        System.out.println("Static initializer block called");
    }
    public static void main(String[] args) {
        Demo Obj1, Obj2;
        // Obj1 = Obj2 = new Demo();
        // System.out.println(b);
        Demo obj = new Demo(10, 5);
        // System.out.println(obj.a);
        // System.out.println(obj.b);
        // new Demo();
        // new Demo(3);
        // System.out.println(b);

    }
}
