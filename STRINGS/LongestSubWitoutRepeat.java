class Solution {
    public int lengthOfLongestSubstring(String s) {
    int max = 0;
    for(int i = 0; i<s.length(); i++){
        String dummy = "";
        dummy += s.charAt(i);
        for(int j = i+1; j<s.length(); j++){
            char c = s.charAt(j);
            if(dummy.indexOf(c)==-1){
                dummy = dummy + c;
            }
            else{
                break;
            }
        }
        max = Math.max(max,dummy.length());
    }
    return max;
    }
}
