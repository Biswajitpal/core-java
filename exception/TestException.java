package exception;

public class TestException {
    public static void main(String[] args) {
        try {
            int n = 10/0;
            System.out.println("call main" +n);
        } catch (Exception e) {
            System.out.println(" call else block" + e);

            // e.printStackTrace();
        // } else {
        //     System.out.println(" call else block");
        }
        try{
            // n = int(input("enter number"));

        }
    }
}
