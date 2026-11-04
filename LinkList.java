import java.util.*;

public class LinkList {
    class Node {
        String data;
        Node link;
        Node(String data){
            this.data = data;
            this.link = null;
        }        
    }
    Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.link = head; 
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.link != null){
            tempNode = tempNode.link;
        }
        tempNode.link = newNode;
    }
    public void deleteNode(){
        if(head == null){
            System.out.println("empty");
        }

    }
    public void print(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node tempNode = head;
        while(tempNode != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.link;
        }
    }
    public static void main(String args[]){
        System.out.println("print main");
        LinkList list = new LinkList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("Link list");
        list.addFirst("This");

        list.print();
        // System.out.println(list.head.data);
    }
}
