class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            String c=String.valueOf(x);
            if(s.contains(c)){
                list.add(i);
            }
        }
        return list;
    }
}