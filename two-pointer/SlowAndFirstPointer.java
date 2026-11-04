class SlowAndFirstPointer {
    public static void main(String[] args) {
        // Example usage of the SlowAndFirstPointer class
        int[] arr = {1, 2, 3, 4, 5};
        int slowPointer = findSlowPointer(arr);
        int firstPointer = findFirstPointer(arr);
        
        System.out.println("Slow Pointer: " + slowPointer);
        System.out.println("First Pointer: " + firstPointer);
    }

    public static int findSlowPointer(int[] arr) {
        // Logic to find the slow pointer
        // For demonstration, returning the middle element
        return arr[arr.length / 2];
    }

    public static int findFirstPointer(int[] arr) {
        // Logic to find the first pointer
        // For demonstration, returning the first element
        return arr[0];
    }
}