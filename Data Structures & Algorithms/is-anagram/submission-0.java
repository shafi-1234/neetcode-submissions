class Solution {
    public boolean isAnagram(String s, String t) {
        int lens=s.length();
        int lent=t.length();
        if(lens!=lent){
            return false;

        }
        HashMap<Character,Integer> maps= new HashMap<>();
        HashMap<Character,Integer> mapt= new HashMap<>();
        for(int  i=0;i<lens;i++){
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        }
        return maps.equals(mapt);


    }
}
