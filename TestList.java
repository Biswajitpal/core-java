import java.util.*;

public class TestList {
    public static void main(String[] args){
        ArrayList<Object> obj= new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<String> string = new ArrayList<String>();
        ArrayList<Boolean> bolArr = new ArrayList<Boolean>();

        // add, get, update, delete, sort
        nums.add(10);
        nums.add(1,100);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.remove(4);
        nums.set(2, 200);
        // System.out.println(nums);
        // System.out.println(nums.get(1));
        // System.out.println(nums.size());
        Collections.sort(nums);
        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }
        int[] arr1 = {1,2,3};
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }


}
