/*
wrapper class present in java.lang package
All wrapper class is immutable class
character and boolean are direct child of object class. all other wrapper class are child class of Integer class
Java is not purely object-oriented because primitives are not objects. Wrapper classes solve this problem.

1. toString()  when we print any object its call toString method if its not present then its call parent class toString method. and toString method return type is string
2. valueOf()
3. 


Why Integer is preferred over int in collections?

Because collections store objects only, not primitives.

Collection framework only work with objects not with primitive data types. so we can use wrapper class to store primitive data types in collection framework.
ArrayList<int> list; ❌ (not allowed)
ArrayList<Integer> list; ✅

Why wrapper classes are immutable?

To ensure:

Thread safety
Caching optimization
Predictable behavior


Autoboxing and Unboxing (Very Important)
int a = 10;
Integer obj = a;  // automatically converted primitive → object (autoboxing)

Integer obj = 20;
int b = obj;  // automatically converted object → primitive (unboxing)
Avoid in performance-critical code:
Integer sum = 0;
for(int i=0; i<1000000; i++){
    sum += i; // boxing/unboxing overhead
}


Manually converting primitive to wrapper class and wrapper class to primitive is called boxing and unboxing respectively.
int a = 10;
Integer obj = Integer.valueOf(a);   // primitive → object

Integer obj2 = 50;
int b = obj2.intValue();           // object → primitive


Java caches wrapper objects for performance.
Integer a = 100;
Integer b = 100;

System.out.println(a == b); // true (cached)

Integer x = 200;
Integer y = 200;

System.out.println(x == y); // false (outside cache range)

Wrapper classes are immutable. When you perform operations on wrapper objects, they create new instances rather than modifying existing ones.
thats why we can not use in loop or === 
Integer a = 10;
a = a + 5; // new object created


permeative Type   Wrapper class  Constructor
byte -->  Byte()          --> byte, String
short -->  Short()        --> short, String
int -->  Integer()        --> int, String
long -->  Long()          --> long, String

float -->  Float()        --> Float, Double, String
double -->  Double()      --> Double, String

char -->   Character()    --> Char
boolean  --> Boolean()    --> Boolean, String
*/

public class WrapperClass {
    public String toString(){

        return "call wrapper class to string method";
    }
    static void m(Integer i) {
        System.out.println("Integer");
    }

    static void m(String s) {
        System.out.println("String");
    }

    static void m1(Object o) {
        System.out.println("Object");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m2(Integer i) {
        System.out.println("Integer");
    }

    static void m2(Long l) {
        System.out.println("Long");
    }

    static void m3(int i) {
        System.out.println("int");
    }

    static void m3(Integer... i) {
        System.out.println("Integer varargs");
    }



    static String num = "123";
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        int x = Integer.parseInt(num); // String to int
        double y = Double.parseDouble(num); // String to double
        float z = Float.parseFloat(num); // String to float
        Integer value = Integer.valueOf(num);
        int a = 10;
        Integer obj1 = a; // autoboxing
        Integer obj = 20;
        int b = obj; // unboxing
        // System.out.println(obj1.getClass().getName());
        // System.out.println(x.getClass().getName());  // getClass() method is not applicable for primitive data types, it will give compile time error
        // System.out.println(a.getClass().getName());

        // System.out.println("Hello, World! "+x);
        // System.out.println("float "+z);
        // System.out.println("double "+y);
        // System.out.println(value);
        // System.out.println(Double.valueOf(101));
        // System.out.println(Integer.toBinaryString(5));
        // System.out.println(Integer.toHexString(50));
        // System.out.println(Integer.toOctalString(50));
        // System.out.println(Integer.parseInt("101", 2));
        // System.out.println(Integer.valueOf("101", 2)); // binary to decimal
        // System.out.println(Integer.valueOf("101", 8)); // octal to decimal
        // System.out.println(Integer.valueOf("101", 16)); // hex to decimal

        // System.out.println(new Integer("100"));
        // System.out.println(new Integer("One"));  //NumberFormatException

        /*
        WrapperClass obj = new WrapperClass();
        System.out.println(obj);
        System.out.println(obj.toString());
        */

        // Question
        // int a4 = null; // compile time error: incompatible types: <null> cannot be converted to int
        Integer a4 = null; // valid, Integer can be null


        int b1 = 100;
        Integer a1 = 100;
        Integer a2 = new Integer(100);

        /* System.out.println(a1 == b1); // true (a1 is unboxed to int for comparison)
        System.out.println(a1 == a2); // false (a1 is cached, a2 is new object)
        System.out.println(a1.equals(a2)); // true (equals method compares values)
        System.out.println(a1.getClass().getName()); // java.lang.Integer

        System.out.println(System.identityHashCode(b1)); // same hash code for cached object
        System.out.println(System.identityHashCode(a1)); // same hash code for cached object
        System.out.println(System.identityHashCode(a2)); // different hash code for new object  */
       

        int x1 = 200;
        int x2 = 200;
        // System.out.println(x1 == x2); // true (primitive comparison)
        
        // Wrapper Identity Leak
        Integer c1 = 100;
        Integer c2 = 100;
        // System.out.println(c1 == c2); // true (cached)

        Integer y3 = 250;
        Integer y2 = 250;
        /* System.out.println(y3 == y2); // false (outside cache range)
        System.out.println(System.identityHashCode(y3)); // different hash code for new object
        System.out.println(System.identityHashCode(y2)); // different hash code for new object
        System.out.println(y3.equals(y2));
        System.out.println(y2.toString());
        System.out.println(y3.toString());
        System.out.println(y2.toString(a1, 16)); // convert x1 to hexadecimal string
        System.out.println(a2.toString());
        System.out.println(y2.valueOf(y2) == y3.valueOf(y3)); // false (cached)

        
        */
        Integer a5 = Integer.valueOf(100);
        Integer b5 = Integer.valueOf(100);

        // System.out.println(a5 == b5); // true (cached)
        // System.out.println(System.identityHashCode(a5)); // same hash code for cached object

        // Wrapper + primitive type
        Integer d = 100;
        Integer e = 100;
        // System.out.println(d == e + 0);  // true (e is unboxed to int for addition, then compared to d which is unboxed to int)

        // Boolean wrapper class
        Boolean aa = true;
        Boolean bb = true;

        // System.out.println(aa == bb); // true (Boolean values are cached)

        // Null Method Call Trap
        // m(null); // This will call m(String s) because String is more specific than Integer for null argument
        // m1(null); // This will call m1(String s) because String is more specific than Object for null argument
        // m2(50);
        // m3(10,20);
        // m3(10);

    }
}
