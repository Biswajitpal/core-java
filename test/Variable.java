package test;

public class Variable {
    int a =10;
    int b= 20;
    static void m1(){
        
        System.out.println(new Variable().a);
        // System.out.println(b);
    }
    void m2(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main( String[] args){
        Variable obj1 = new Variable();
        m1();
        obj1.m2();
    }

}
