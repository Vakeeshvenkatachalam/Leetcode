class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int j=0;
       for(int i=0;i<n;i++){
        for(j=0;j<n;j++){
            ans[i]=nums[i];
        }
         ans[i+n]=nums[i];
       }
       return ans;
    }
}