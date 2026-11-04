public class Test {
    public static void printSum(int sum) {
        System.out.println("The sum is: " + sum);
    }

    public void someMethod(String name) {
        System.out.println("This is SOME method: " + name);
    }
    public static String address = "123 Main St";
    public String email = "test@example.com";

    public static void main(String[] args) {
        int sum = 105;
        printSum(sum);
        Test test = new Test();
        test.someMethod("Test");
        System.out.println("Address: " + address);
        System.out.println("Email: " + test.email);
        System.out.println("Sum: " + sum);
    }
}
