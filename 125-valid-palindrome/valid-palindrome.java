class Solution {
    public boolean isPalindrome(String s) {
        String e;
        e=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0;
        int r=e.length()-1;

        while(l<r){
            if(e.charAt(l)!=e.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;

    }
}