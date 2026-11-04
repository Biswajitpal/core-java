package method;

import java.util.Scanner;

public class BuiltIn {
    public static void testMath(){
        double x = Math.sqrt(100);
        System.out.println("Double" + x);
        System.out.println(Math.abs(-10));  // "ABS"
        System.out.println(Math.floor(-15.23));  // "Floor"
        System.out.println(Math.round(16.66));  // "Round return int"
        System.out.println(Math.ceil(-16.16));  // "Ceil"
        System.out.println(Math.ceil(17.0001));  // "Ceil"
    }

    int checkMax(int a, int b, int c){
        return Math.max(Math.max(a,b), c);
    }
    int checkMin(){
        // return Math.min(Math.min(a,b), c);
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        return Math.min(Math.min(a,b), Math.min(c,d));
    }
    public static void main(String[] args){
        // testMath();
        BuiltIn obj = new BuiltIn();
        
    }
}
