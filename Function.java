import java.util.HashMap;
import java.util.Map;

public class Function {
    public static void fib(int num) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
    public int lastFib(int a) {
        return lastFib(a, new HashMap<>());
    }
    public int lastFib(int a, Map<Integer, Integer> memo) {
        if (a <= 1) {
            return a;
        }
        if (memo.containsKey(a)) {
            return memo.get(a);
        }
        int result = lastFib(a - 1, memo) + lastFib(a - 2, memo);
        memo.put(a, result);
        return result;
    }

    public static void main(String[] args) {
        int sum = 75;
        System.out.println("Sum: " + sum);
        // fib(sum);vector
        System.out.println("Last Fibonacci number: " + new Function().lastFib(sum));
    }
}
