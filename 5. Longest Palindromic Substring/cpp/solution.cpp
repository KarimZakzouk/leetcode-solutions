class Solution {
public:
    string longestPalindrome(string s) {
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.size() - 1; i++){
            int r = i;
            int l = i;
            while(r + 1 < s.size() && s[l] == s[r + 1]){
                r++;
            }
            while(l >= 0 && r < s.size() && s[l] == s[r]){
                if(r - l > right - left){
                    right = r;
                    left = l;
                }
                r++;
                l--;
            }
        }
        string solution = "";
        for(int i = left; i <= right; i++){
            solution+=s[i];
        }
        return solution;
    }
};