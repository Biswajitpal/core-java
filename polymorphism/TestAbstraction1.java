package polymorphism;

abstract class Test {

    abstract void m1(); // abstract method
    abstract void m2(); // abstract method

    void m3() {
        System.out.println("This is m1 method.");
    }
}
abstract class Test1 extends Test {

    void m1() {
        System.out.println("This is m2 method");
    }
}
class TestAbstraction1 extends Test1 {
    void m2() {
        System.out.println("This is m3 method");
    }
    public static void main(String[] args) {
        Test obj = new TestAbstraction1();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}