package polymorphism;
abstract class Test10{
    abstract void m2();
    {
        System.out.println("This is an instance block in the Test class.");
    }
    static{
        System.out.println("This is an static block in the Test class.");
    }
    Test10() {
        System.out.println("This is a constructor in the Test class.");
    }

}
class TestAbstraction3 extends Test10 {
    void m2() {
        System.out.println("This is m2 method");
    }

    {
        System.out.println("This is an instance block in the TestAbstraction3 class.");
    }
    static{
        System.out.println("This is an static block in the TestAbstraction3 class.");
    }
    TestAbstraction3() {
        super();
        System.out.println("This is a constructor in the TestAbstraction3 class.");
    }
    public static void main(String[] args) {
        System.out.println("This is a main method in the TestAbstraction3 class.");
        TestAbstraction3 obj = new TestAbstraction3();
        obj.m2();
    }
}