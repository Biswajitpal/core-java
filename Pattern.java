import java.util.ArrayList;

public class Pattern {
    static void printRightTangle(int n){
        for(int i = 0; i<n; i++ ){
            for (int j = 0; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void printInvertedRightTangle(int n){
        for(int i = 0; i<n; i++ ){
            for (int j = 0; j<n-i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void printPrimedPartan(int n){
        for(int i = 0; i<n*2; i+=2 ){
            for(int j = 0; j<n+i-1; j++ ){
                // System.out.println(n-j +"-->"+ j +"=="+ (j>=n-j));
                if(j>n-j || j<n+i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");

        } 
        /* for(int i = 0; i<n; i++ ){
            for (int j = 0; j<=n; j++ ){
                if(j>=n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            for (int j = 0; j<i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        } */
    }
    public static void main(String [] args){
        // printRightTangle(5);
        // printInvertedRightTangle(5);
        // printPrimedPartan(5);
        int [] nums = {2,4,6,5};
        int [] newArray = new int[nums.length];
        int temp = 0;
        for(int i = nums.length-1; i >= 0 ; i--){
            int digit = (int) Math.pow(10, i) * nums[i];
            temp += digit;
            newArray[(nums.length-1)-i] = nums[i];
        }
        System.out.println(temp);
        System.out.println(newArray[0] +"--"+ newArray[3]);
    }
}
