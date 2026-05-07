package polymorphism;

interface Test11{
    abstract void m2();

}
class TestAbstraction4 implements Test11 {
    public void m2() {
        System.out.println("This is m2 method");
    }

    {
        System.out.println("This is an instance block in the TestAbstraction4 class.");
    }
    static{
        System.out.println("This is an static block in the TestAbstraction4 class.");
    }
    TestAbstraction4() {
        System.out.println("This is a constructor in the TestAbstraction4 class.");
    }
    public static void main(String[] args) {
        TestAbstraction4 obj = new TestAbstraction4();
        obj.m2();
    }
}