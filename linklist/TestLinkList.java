package linklist;

import java.util.LinkedList;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TestLinkList {
    public static void main(String[] args) {
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // n1.next = n2;
        // System.out.println(n1.data); // 10
        // System.out.println(n1.next.data); // 10

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(2)); // 30
        System.out.println(list.getFirst()); // 10 
        System.out.println(list.getLast()); // 40
        System.out.println(list.size()); // 4
        list.addFirst(5);
        list.addLast(50);
        System.out.println(list); // [5, 10, 20, 30, 40, 50]
        list.removeIf(x -> x%2==0);
        System.out.println(list); // [5]
    
    }
    
}
