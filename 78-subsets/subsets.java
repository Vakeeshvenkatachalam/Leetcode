class Solution {
    static void backtrack(int[] nums,int index,List<Integer> list,List<List<Integer>> subsets){
            subsets.add(new ArrayList<>(list));
            for(int i=index;i<nums.length;i++){
                list.add(nums[i]);
                backtrack(nums,i+1,list,subsets);
                list.remove(list.size()-1);
            }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(nums,0,list,subsets);
        return subsets;
    }
}