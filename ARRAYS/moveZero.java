//283. MOVE ZEROES TO END

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p=0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0 ) {
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                p++;
            }
        }
    }
}