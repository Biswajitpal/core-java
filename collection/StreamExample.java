package collection;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Example of using Stream API to filter and print even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 20, 23, 40, 25, 6, 7, 8, 9, 10);
        
        System.out.println("Even numbers:");
        List<Integer> evenNumbers = numbers.stream()
                                        .map((elem) -> elem * 2)
                                        .toList();
        evenNumbers.forEach(System.out::println);
        System.out.println("Count original data: " + numbers.stream().count());
        System.out.println("Count data: " + evenNumbers.size());

        // numbers.stream().filter(n -> n % 2 == 0);

        List<Integer> sortNumbersAsc = numbers.stream().sorted().toList();
        // List<Integer> sortNumbersDesc = numbers.stream().sorted((a, b) -> (a<b) ? 1 : ((b<a) ? -1 : 0)).toList();
        // List<Integer> sortNumbersDesc = numbers.stream().sorted((a, b) -> b.compareTo(a)).toList();
        List<Integer> sortNumbersDesc = numbers.stream().sorted((a, b) -> -a.compareTo(b)).toList();
        System.out.println("Sorted numbers (ascending):");
        sortNumbersAsc.forEach(System.out::println);
        System.out.println("Sorted numbers (descending):");
        sortNumbersDesc.forEach(System.out::println);
    }
}
