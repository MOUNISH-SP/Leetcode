class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=s.length();
        int y=t.length();
   
        int l=0;
        for(int r=0; r<y && l<x ;r++){
            if(t.charAt(r)==s.charAt(l)){
                l++;
            }
        }
        return l==x;


        //we should use the teopointer like the first pointer in the first sting and second pointer in the seocnd sting 
        //left pointer=first sting
        //right pointer=sceionf string
        //when the left pointet starts and right pointer starts also comaoitn both 
        //ifthe sting left with in the right string then trueorfalse


    }
}