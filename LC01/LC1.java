import java.util.Arrays;
import java.util.HashMap;

public class LC1 {
    public static void main(String args[]) {
        int[] twoSumTestA = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(twoSumTestA, 9)));
        // Result should be [0, 1]

        int[] twoSumTestB = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(twoSumTestB, 6)));
        // Result should be [1, 2]

        int[] twoSumTestC = {3, 3};
        System.out.println(Arrays.toString(twoSum(twoSumTestC, 6)));
        // Result should be [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (myHashmap.containsKey(target - nums[i])) {
                int[] myResult = {myHashmap.get(target - nums[i]), i};
                return myResult;
            } 
            myHashmap.put(nums[i], i);
        }
        int[] myResult = {0, 1};
        return myResult;
    }
}