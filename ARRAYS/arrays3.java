// 1752. Check if Array Is Sorted and Rotated

class arrays3 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i=0; i<n; i++){
            int next = (i+1)% n;
            if(nums[i] > nums[next]) {
                count++;
            }
        }
        if(count < 2) {
            return true;
        }
        return false;
    }
}
