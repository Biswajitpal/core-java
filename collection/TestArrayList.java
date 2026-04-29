package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add(1, "Banana");
        fruits.add(1, "mango");
        System.err.println(fruits);

        /*ArrayList <String> list = new ArrayList<>(15);
        list.add("Hello");
        list.add("World");
        list.add(1, "new element"); 
        list.set(1, "update element"); 
        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        // for (String string : list) {
        //     System.out.println(string);
        // }
        System.out.println(list);
        // System.out.println(list.contains("Hello"));
        // System.out.println(list.remove("World55")); // false
        // System.out.println(list.remove("World")); // true
        List <String> list2 = new ArrayList<>(list);
        list2.add("new element2");
        System.out.println(list2);*/
        List <Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.sort(null); // null is used to sort in natural order
        System.out.println(nums);
        // Collections.sort(nums); 
        // System.out.println(nums);
        // Collections.sort(nums, Collections.reverseOrder());
        // System.out.println(nums);

        // ArrayList <String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Orange", "Mango", "Grapes", "Pineapple", "Peach", "Strawberry", "Blueberry", "Watermelon", "Kiwi", "Papaya", "Cherry", "Lemon", "Lime", "Coconut", "Avocado", "Raspberry", "Blackberry", "Tangerine"));
        // // fruits.sort(new StringLengthComparator());
        // fruits.sort((a,b) -> a.length() - b.length()); // lambda expression to sort by length
        // System.out.println(fruits);
    
    }

}
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
    }
}