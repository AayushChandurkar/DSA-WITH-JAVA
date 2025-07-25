class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int left = 0;
//         int right = nums.length-1;
//         int temp [] = new int[nums.length];
//         int index = 0;
//         while(left<=right){
//             if(nums[left] == 0){
//                 left++;
//             }
//             else{
//                 temp[index] = nums[left];
//                 left++;
//                 index++;
//             }
//         }
//         for(int i = 0; i<nums.length; i++){
//             nums[i] = temp[i];
//         }
//     }
// }
