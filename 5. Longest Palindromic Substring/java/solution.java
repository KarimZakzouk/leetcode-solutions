class Solution {
    public String longestPalindrome(String s) {
                int left = 0;
        int right = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int r = i;
            int l = i;
            while(r + 1 < s.length() && s.charAt(l) == s.charAt(r + 1)){
                r++;
            }
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l > right - left){
                    right = r;
                    left = l;
                }
                r++;
                l--;
            }
        }
        String solution = "";
        for(int i = left; i <= right; i++){
            solution+=s.charAt(i);
        }
        return solution;
    }
}