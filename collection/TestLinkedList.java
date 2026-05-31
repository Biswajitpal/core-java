package collection;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Mango");
        linkedList.add("Banana");
        System.out.println(linkedList);

        LinkedList<Integer> numbers = new LinkedList<>(List.of(3, 1, 2));
        System.out.println(numbers);
    } 
    
}
