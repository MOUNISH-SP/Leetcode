class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=s.length();
        int y=t.length();

        int i=0;
        for(int j=0;j<y&& i<x;j++){
            if(t.charAt(j)==s.charAt(i)){
                i++;
            }
        }
        return i==x;


        //we should use the teopointer like the first pointer in the first sting and second pointer in the seocnd sting 
        //left pointer=first sting
        //right pointer=sceionf string
        //when the left pointet starts and right pointer starts also comaoitn both 
        //ifthe sting left with in the right string then trueorfalse


    }
}