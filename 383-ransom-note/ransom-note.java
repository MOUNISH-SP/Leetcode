class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charcounts= new int[26];

        for(char c:magazine.toCharArray()){
            charcounts[c-'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            if(!(charcounts[c-'a']>0)){
                return false;
            }
            charcounts[c-'a']--;
        }
        return true;
    }
}