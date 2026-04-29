import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collectionFramework {
    // List --> An order collection that can contain duplicates
    // Set --> A collection that cannot contain duplicates
    // Map --> A collection of key-value pairs
    // Queue --> A collection that follows the FIFO (First In, First Out) principle
    // Deque --> A double-ended queue that allows insertion and removal from both ends

    void arrayList() {
        String[] list1 = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList("Dog", "Cat", "Mouse");
        ArrayList<String> list3 = new ArrayList<>(50); // Default initial capacity is 10
        // list.add("Hello");
        // list.add("World");
        // list.add("Hello"); // Duplicates are allowed
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());
        System.out.println(list3.getClass().getName());

        System.out.println(list3);
        System.out.println(list3.size());
    }   
    public static void main(String[] args) {
        // ArrayList<Number> list = new ArrayList<>(100); // Initial capacity of 100
        collectionFramework obj = new collectionFramework();
        obj.arrayList();
    }

}
