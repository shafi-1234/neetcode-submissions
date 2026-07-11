
class Solution {
    public int maxArea(int[] heights) {
      int maxarea =0;
      int n =heights.length;
      int l=0;
      int r=n-1;
      int res=0;
      while(l<r){
        int h=Math.min(heights[l],heights[r]);
        int w=r-l;
        maxarea=h*w;
        res=Math.max(res,maxarea);

        if(heights[l]<=heights[r]){
          l++;
        }else{
          r--;
        }

      }
        return res;
    }
}
