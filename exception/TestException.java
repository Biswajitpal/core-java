package exception;
/*
Java have 50 keywords
exception is a event it stop program abnormally
when exception occur rest of the code will not execute

handel exception using try catch block or through keyword

try
catch
finally

throw
throws

three types of exception in java
1. Checked exception  : compile time exception
2. Unchecked exception : runtime exception
3. Error : system-level exception
*/
public class TestException {
    public static void main(String[] args) {
        try {
            // int n = 10/0;  // arithmetic exception
            // System.out.println("call main" +n);

            // int [] arr = new int[5];  // array index out of bound exception
            // arr[10] = 100;

            // String str = "Hello";  // null pointer exception
            // System.out.println(str.charAt(10));  // string index out of bound exception
            
            // int a = Integer.parseInt("abc");  // number format exception
            // System.out.println(a);

            System.out.println("Hello world1");
            System.out.println("Hello world2");
            Thread.sleep(6000);
            System.out.println("Hello world3");
            System.out.println("Hello world4");
            
            
        } catch (Exception e) {
            System.out.println(" call else block" + e);

            // e.printStackTrace();
        // } else {
        //     System.out.println(" call else block");
        }
    }
}
