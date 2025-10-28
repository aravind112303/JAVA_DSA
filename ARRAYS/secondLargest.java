public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {3,6,1,8,9,4};
        int large = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > large) {
                secondL = large;
                large = nums[i];
            }
            else if(nums[i] > secondL && nums[i] != large) {
                secondL = nums[i];
            }
        }
        System.out.println(secondL);
    }
}