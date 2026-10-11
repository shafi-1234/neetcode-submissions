class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>1){
            return true;
        }
        }
       
        return false;
    }
}