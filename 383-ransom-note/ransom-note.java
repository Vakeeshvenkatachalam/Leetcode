class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(char c:magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char d:ransomNote.toCharArray()){
            if(freq[d-'a']==0){
                return false;
            }
            freq[d-'a']--;
        }
        return true;
    }
}