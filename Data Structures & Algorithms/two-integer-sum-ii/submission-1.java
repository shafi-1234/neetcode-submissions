class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n =arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int c=target-arr[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i+1};
            }
            map.put(arr[i],i+1);
        }
        return new int[]{};
        
    }
}
