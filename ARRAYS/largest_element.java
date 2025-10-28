class largest_element {
    public static int largestElement(int[] nums) {
        int largeValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largeValue < nums[i]) {
                largeValue = nums[i];
            }
        }
        return largeValue;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        int large = largestElement(nums);
        System.out.println("Largest Element: " + large);
    }
}
