import java.util.HashMap;
class TwoSumProblem {   
    // int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer, Integer> numMap = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (numMap.containsKey(complement)) {
    //             return new int[]{numMap.get(complement), i};
    //         }
    //         numMap.put(nums[i], i);
    //     }
    //     throw new IllegalArgumentException("No two sum solution");
    // }
    void toSum(int [] nums, int target){
        for(int i=0; i< nums.length; i++){
            for(int j- i+1;)
        }
    }
    public static void main(String[] args) {
        TwoSumProblem obj = new TwoSumProblem();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}