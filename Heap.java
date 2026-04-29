import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    void maxHeapExample() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(8);
        maxHeap.add(5);
        maxHeap.add(3);
        System.out.println(maxHeap.peek()); // Output: 8 (the largest element)
        maxHeap.add(10);
        System.out.println(maxHeap.peek()); // Output: 10 (the largest element)
    }
    void minHeapExample() {
        /* PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        System.out.println(minHeap.peek()); // Output: 3 (the smallest element)
        minHeap.add(1);
        System.out.println(minHeap.peek()); // Output: 1 (the smallest element) */
        PriorityQueue<String> minHeap = new PriorityQueue<>();
        minHeap.add("banana");
        minHeap.add("apple");
        minHeap.add("cherry");
        System.out.println(minHeap.offer("cherry"));
        System.out.println(minHeap.peek()); // Output: "apple" (the smallest element in lexicographical order)
        minHeap.add("apqkio");
        minHeap.add("aaaa");
        minHeap.add("zzzz");
        System.out.println(minHeap); // Output: "apqkio" (the smallest element in lexicographical order)
    }
    int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }
        return minHeap.peek(); // The root of the min-heap is the kth largest element
    }
    ArrayList<String> relativeRanks506(ArrayList<Integer> score){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        // ArrayList<String> result = new ArrayList<>(score.size());
        ArrayList<String> result = new ArrayList<>(
            Collections.nCopies(score.size(), "")
        );
        for (int s : score){
            maxHeap.add(s);
        }
        System.out.println("maxheap: " + maxHeap);
        for( int i=0; i<score.size(); i++){
            int currentScore = maxHeap.poll();
            int index = score.indexOf(currentScore);
            System.out.println(index + ", " + currentScore + ", " + maxHeap);
            // maxHeap.poll();
            if(i==0){
                result.set(index, "Gold Medal");
            } else if(i==1){
                result.set(index, "Silver Medal");
            } else if(i==2){
                result.set(index, "Bronze Medal");
            } else {
                result.set(index, String.valueOf(i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        Heap heap = new Heap();
        // heap.maxHeapExample();
        // heap.minHeapExample();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 7;

        ArrayList<Integer> numsList = new ArrayList<>(
            Arrays.asList(3, 2, 1, 5, 6, 4)
        );
        ArrayList<String> ranks = heap.relativeRanks506(numsList);
        System.out.println(ranks);
        // int kthLargest = heap.findKthLargest(nums, k);
        // System.out.println(kthLargest);
        // System.out.println(Comparator.reverseOrder());
        // System.out.println(nums.getClass().getName());
    }        
}
