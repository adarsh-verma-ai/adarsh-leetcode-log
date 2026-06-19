class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        
        for (int x : nums) count[x]++;
        
        int i = 0;
        for (int j = 0; j < count[0]; j++) nums[i++] = 0;
        for (int j = 0; j < count[1]; j++) nums[i++] = 1;
        for (int j = 0; j < count[2]; j++) nums[i++] = 2;
    }
}