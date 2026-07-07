class Solution {
    //https://leetcode.com/problems/valid-palindrome/
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            int asci_code_i = (int) Character.toLowerCase(s.charAt(i));
            int asci_code_j = (int) Character.toLowerCase(s.charAt(j));
            System.out.println("i: " + i + ", j: " + j + ", char at i: " + s.charAt(i)+asci_code_i + ", char at j: " + s.charAt(j)+asci_code_j);

            if(!(asci_code_i >=97 && asci_code_i <= 122)){
                i++;
                continue;
            }
            if(!(asci_code_j >=97 && asci_code_j <= 122)){
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // public String reverseString(String s) {
    //     char[] arr = s.toCharArray();
    //     int left = 0;
    //     int right = arr.length - 1;

    //     while (left < right) {
    //         // Swap characters at left and right indices
    //         char temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;

    //         // Move towards the middle
    //         left++;
    //         right--;
    //     }

    //     return new String(arr);
       
    // }

    //https://leetcode.com/problems/reverse-string/solutions/7652076/best-optimal-solution-on-java-c-python-j-92pp/
    public char[] reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        // char[] ch = s.toCharArray()
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            System.out.println(s);
        }
        return s;
        
    }

    //https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] squareOfSortedArray(int[] nums){
        int left = 0, right = nums.length - 1, index = nums.length - 1;
        int[] result = new int[nums.length];
        while(left <= right){
            if(Math.abs(nums[left])>= Math.abs(nums[right])){
                result[index] = nums[left] * nums[left];
                index--;
                left++;
            }else{
                result[index] = nums[right] * nums[right];
                index--;
                right--;
            }
        }
        return result; 
    }

    // https://leetcode.com/problems/valid-palindrome-ii/
    public boolean validPalindrome(String s) {
        // char[] ch = s.stringToArray();
        int i=0, j=s.length()-1;
        boolean deleteOneCh = false;
        while(i<j){
            int startCode = (int) Character.toLowerCase(s.charAt(i));
            int endCode = (int) Character.toLowerCase(s.charAt(j));

            if(startCode == endCode){
                i++;
                j--;
            }
            else if(startCode != endCode && deleteOneCh){
                                System.out.println("startCode: " + startCode + ", endCode: " + endCode + ", char at i: " + s.charAt(i) + ", char at j: " + s.charAt(j));

                return false;
            }else if(startCode != endCode && ((int) Character.toLowerCase(s.charAt(i+1)) == endCode)){
                System.out.println("i: " + i + ", endCode: " + endCode + ", char at i: " + s.charAt(i) + ", char at j: " + s.charAt(j));

                i++;
                deleteOneCh = true;
            }else if(startCode != endCode && ((int) Character.toLowerCase(s.charAt(j-1)) == startCode)){
                System.out.println("j: " + j + ", endCode: " + endCode + ", char at i: " + s.charAt(i) + ", char at j: " + s.charAt(j));

                j--;
                deleteOneCh = true;
            }else{
                return false;
            }

        }
        return true;
    }
    public static void main(String args []){
        Solution s = new Solution();
        // System.out.println(s.isPalindrome("0p"));
        // System.out.println(s.isPalindrome("race a car"));
        // System.out.println(s.reverseString("hello".toCharArray()));
        System.out.println(s.validPalindrome("mgmlcuppuculmgm"));
    }
}