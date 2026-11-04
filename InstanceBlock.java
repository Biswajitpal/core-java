class Parent{
    static {
        System.out.println("Parent class static block call");
    }
    {
        System.out.println("Parent class instance block call");
    }
    Parent( int a){
        System.out.println("Parent class constructor call" + a);
    }
}


public class InstanceBlock extends Parent {

    /*
    instance block is a block of code which is used to initialize the instance variable
    instance block is executed when the object is created and constructor are executed after the instance block

    why need instance block

    each constructor have different logic but instance block have common logic for all object
    if we want to initialize the instance variable then we can use instance block

    */
    {
        System.out.println("Instance block call");
    }
    InstanceBlock(){
        super(5);
        // this(10);
        System.out.println("0 args Constructor call");
    }
    InstanceBlock(int a){
        super(55);
        System.out.println("1 args Constructor call");
    }
    InstanceBlock(int a, int b){
        super(555);
        System.out.println("2 args Constructor call");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(10);
        // new InstanceBlock(10, 20);
    }
    
}
