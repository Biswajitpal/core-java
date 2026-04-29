import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class TestArray {
    static void testCollection(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,String> map = new HashMap<>();

        arrayList.add(10);
        linkedList.add(20);
        vector.add(30);
        stack.push(40);
        map.put(1,"Apple");

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(vector);
        System.out.println(stack);
        System.out.println(map);
    }
    static void arrayList(){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Array List:" + list);
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("Array List after adding elements: " + list);
        list.remove("World");
        System.out.println("Array List after removing 'World': " + list);

    }
    public static void main(String[] args) {
        // arrayList();
        testCollection();
        /* int[] arr = {1, 2, 3, 4, 5};
        String[] strArr = {"Hello", "World", "Java"};
        for(String str : strArr) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "Biswajit");
        newMap.put(3, "Pal");
        System.out.println("\nValue for key 1: " + newMap.get(1));
        System.out.println("Value for key 3: " + newMap.get(3));
        System.out.println("Get Keys: " + newMap.keySet());
        System.out.println("Get Values: " + newMap.values());

        for(int key: newMap.keySet()){
            System.out.println("Key: " + key + ", Value: " + newMap.get(key));
        }
        for(String value: newMap.values()){
            System.out.println("Value: " + value);
        }
        newMap.remove(3);
        System.out.println("Value for key 3 after removal: " + newMap.get(3)); */
    }
}
