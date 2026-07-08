class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        int curr=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                curr++;
            }
        
        else{
            longest=Math.max(longest,curr);
            curr=1;
        }
        
    }
    return Math.max(longest,curr);
}
}