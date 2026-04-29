package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <String> v = new Vector<>(10, 5);
        System.out.println(v.capacity()); // 10
        System.out.println(v.size()); // 0
        v.add("Hello");
        v.add("World");
        v.add("Java");
        v.add("Python");
        v.add("C++");
        v.add("JavaScript");
        v.add("Ruby");
        v.add("PHP");
        v.add("Swift");
        v.add("Go");
        System.out.println(v.capacity()); // 10
        System.out.println(v.size()); // 10
        System.out.println(v); 
        
    }
    
}
