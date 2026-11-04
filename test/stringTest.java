package test;

public class stringTest {
    public String toString(){
        return "Test class";

    }
    public void checkEqual(){
        String s1 = "rantan";
        String s2 = "anu";
        String s3 = "rantan";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
    public static void main(String[] args){

        // immutable
        /* String s1 = "Biswajit";
        s1.concat(" new string");
        String s2 = new String("Hello");
        StringBuffer sb1 = new StringBuffer("Hello Buffer");
        System.out.println("Called string" + s1 + s2);
        System.out.println("Sb" + sb1);
        */
        stringTest t1 = new stringTest();
        // System.out.println(t1); 
        t1.checkEqual();

    }
}
