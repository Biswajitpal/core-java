package operator;

import java.math.BigInteger;

public class BitWiseOperator {
    static void checkEvenOdd(int number) {
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    static void swapNumbers(int x, int y) {
        System.out.println("Input variable: x = " + x + ", y = " + y);

        x=x-y;
        y=x+y;
        x=y-x;
        
        System.out.println("Before swap: x = " + x + ", y = " + y);
        x = x ^ y; // Step 1: x now holds the result of x XOR y
        y = x ^ y; // Step 2: y now holds the original value of x
        x = x ^ y; // Step 3: x now holds the original value of y
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
    static int findUniqueNumber(int[] arr){
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation to find the unique number
        }
        System.out.println("Unique number: " + unique);
        return unique;
    }
    static int multiplyByPowerOfTwo(int number, int power) {
        int result = number << power; // Left shift to multiply by 2^power
        System.out.println(number + " multiplied by 2^" + power + " is: " + result);
        return result;
    }
    static int divideByPowerOfTwo(int number, int power) {
        int result = number >> power; // Right shift to divide by 2^power
        System.out.println(number + " divided by 2^" + power + " is: " + result);
        return result;
    }
    static int checkNoOfOneBits(int OriginalNumber) {
        int count = 0;
        int number = OriginalNumber;
        while (number != 0) {
            count += (number & 1); // Increment count if the least significant bit is 1
            if (number < 0) {
                number = number >>> 1; // Use unsigned right shift for negative numbers
            } else {
                number >>= 1; // Right shift to check the next bit
            }
            number >>= 1; // Right shift to check the next bit
        }
        System.out.println("Number of 1 bits in " + OriginalNumber + " is: " + count);
        return count;
    }
    static int onesComplement(int n) {
        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;
        return n ^ mask;
    }
    public static String decimalToBinary(BigInteger num) {
        if (num.equals(BigInteger.ZERO)) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (num.compareTo(BigInteger.ZERO) > 0) {
            binary.append(num.mod(BigInteger.TWO));
            num = num.divide(BigInteger.TWO);
        }

        return binary.reverse().toString();
    }
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 4; // 0100 in binary

        // Bitwise AND
        int andResult = a & b; // 0100 in binary, which is 4 in decimal
        System.out.println("Bitwise AND: " + andResult);
        // checkEvenOdd(a);
        // checkEvenOdd(b);

        // Bitwise OR
        int orResult = a | b; // 0101 in binary, which is 5 in decimal
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise XOR: " + xorResult);
        // swapNumbers(a, b);
        // findUniqueNumber(new int[]{1, 2, 3, 2, 1});

        // Bitwise NOT
        int notResult = ~a; // 1010 in binary (two's complement), which is -6 in decimal
        System.out.println("Bitwise NOT: " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // 1010 in binary, which is 10 in decimal
        System.out.println("Left Shift: " + leftShiftResult);
        // multiplyByPowerOfTwo(a, 3); // Multiply a by 2^3 (8)
        System.out.println("Ones Complement of " + a + " is: " + onesComplement(a));
        System.out.println("Ones Complement of " + a + " is: " + onesComplement(-a));

        // Right Shift
        int rightShiftResult = a >> 1; // 0010 in binary, which is 2 in decimal
        System.out.println("Right Shift: " + rightShiftResult);
        // divideByPowerOfTwo(a, 1); // Divide a by 2^1 (2)
        // checkNoOfOneBits(-7);
    }
}
