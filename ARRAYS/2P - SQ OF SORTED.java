import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp [] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];
            if(leftsq>rightsq){
                temp[index] = leftsq;
                left++;
            }
            else{
                temp[index] = rightsq;
                right--;
            }
            index--;
        }
        return temp;
    }
}
