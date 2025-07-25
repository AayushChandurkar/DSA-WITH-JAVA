import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();        
        Arrays.sort(copy);                

        int left = 0;
        int right = copy.length - 1;
        int num1 = 0, num2 = 0;

        while (left < right) {
            int sum = copy[left] + copy[right];
            if (sum == target) {
                num1 = copy[left];
                num2 = copy[right];
                break;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        int[] ans = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1 || nums[i] == num2) {
                ans[index++] = i;
                if (index == 2) break;
            }
        }

        return ans;
    }
}
