public class loop {

    static void trianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"");
                // System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void reverseTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j>i)
                System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Simple for loop
        /* for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        } */
    //    trianglePattern(5);
       reverseTrianglePattern(5);
    }
}