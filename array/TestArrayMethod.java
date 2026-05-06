public class TestArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = arr; // Array of size 10 => default value is 0
        // System.out.println("First element of new array: " + newArr[0]);
        // System.out.println("Array length: " + arr.length);
        // System.out.println("First element: " + arr[0]);
        // System.out.println("Last element: " + arr[arr.length - 1]);

        newArr[0] = 10; // Modifying the first element of newArr
        System.out.println("First element of new array after modification: " + newArr[0]);
        System.out.println("First element of original array after modification: " + arr[0]);

    }
}
