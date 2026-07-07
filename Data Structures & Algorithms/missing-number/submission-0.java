class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long actual_sum=0;
        long expected_sum = n*(n+1)/2;
        for(int sum : nums){
            actual_sum += sum;
        } 
        return (int) (expected_sum - actual_sum);
        
    }
}
