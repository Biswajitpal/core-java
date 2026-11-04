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

    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void addNode(Node head, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
        
        TestLinkList ob = new TestLinkList();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        ob.printList(head);

        ob.addNode(head, 50);
        ob.printList(head);

        // LinkedList<Integer> list = new LinkedList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // System.out.println(list);
        // System.out.println(list.get(2)); // 30
        // System.out.println(list.getFirst()); // 10 
        // System.out.println(list.getLast()); // 40
        // System.out.println(list.size()); // 4
        // list.addFirst(5);
        // list.addLast(50);
        // System.out.println(list); // [5, 10, 20, 30, 40, 50]
        // list.removeIf(x -> x%2==0);
        // System.out.println(list); // [5]

        
    
    }
    
}
