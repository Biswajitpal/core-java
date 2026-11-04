package polymorphism;

abstract class TestAbstraction2 {
    abstract void m2();

    {
        System.out.println("This is an instance block in the TestAbstraction2 class.");
    }
    static{
        System.out.println("This is an static block in the TestAbstraction2 class.");
    }
    TestAbstraction2() {
        System.out.println("This is a constructor in the TestAbstraction2 class.");
    }
    public static void main(String[] args) {
        System.out.println("This is a main method in the TestAbstraction2 class.");
        // TestAbstraction2 obj = new TestAbstraction2() {
        //     @Override
        //     void m2() {
        //         System.out.println("This is m3 method");
        //     }
        // };
        // obj.m2();
    }
}