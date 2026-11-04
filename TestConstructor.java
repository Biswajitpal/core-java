class Emp {
    int empId;
    String name;
    float sal;

    Emp(int empId, String name, float sal){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
    Emp(){

    }
    void display(){
        System.out.println("empId: "+ empId);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ sal);
    }
}

public class TestConstructor {
    /*
    constructor name class name must be same
    constructor take parameter
    constructor not have any return type
    
    two type of constructor default constructor and user define constructor
    if we not declare any constructor then compiler generate default 0 argument constructor
    default argument constructor not have any declaration

    using this keyword we are call the constructor
    constructor call using this keyword and its must be first statement of the constructor
    we can't call two constructor at a time in a constructor
    one constructor call only one constructor at a time

    */
   TestConstructor(){
    this('B');
    System.out.println("o argument constructor call");
   }

   TestConstructor( char ch){
    this(10,25);
    System.out.println("1 argument constructor call");
    
   }

   TestConstructor(int a, int b){

    System.out.println("2 argument constructor call" + (a+b));
   }

   void m1(){
    System.out.println("call m1 method");
   }
   public static void main(String [] args){
    // format of object creation

    // 1. nameless approach
    new TestConstructor().m1();
    // 2. named object approach
    TestConstructor obj1 = new TestConstructor(10,20);
    obj1.m1();
    /* Emp obj2 = new Emp(101, "Ratan", 10000);
    Emp obj3 = new Emp();
    obj2.display();
    obj3.display(); */
   }
    
}
