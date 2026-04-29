import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class MyQueue {
    void stackExample() {
        java.util.Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // Output: 3 (the top element)
        stack.pop();
        System.out.println(stack.peek()); // Output: 2 (the new top element)
    }   
    void queueExample() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek()); // Output: 1 (the front element)
        queue.remove();
        System.out.println(queue.peek()); // Output: 2 (the new front element)
    }
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.queueExample();
    }
}
