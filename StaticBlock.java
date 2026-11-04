class A{

    static{
        System.out.println("static block A");
    }
    {
        System.out.println("call instance variable in A class");
    }
}
class B{
    static int a;
    static{
        a = 10;
        System.out.println("static block B: " + a);
    }
}
public class StaticBlock extends A {
    /*
    why used static block
     

    Static block execute when . class file is load
    up to 1.5 version with out main method we can run java file 
    

    */
    static {
        System.out.println("call first static block");
    }
    static {
        System.out.println("call second static block");
    }
    StaticBlock(){
        System.out.println("call 0 args constructor");
    }
    
    public static void main(String [] args) throws ClassNotFoundException{
        Class.forName("B");  // we can call class static block using forName() method
        // StaticBlock obj = new StaticBlock();
        // System.out.println("call main method");
    }
}
