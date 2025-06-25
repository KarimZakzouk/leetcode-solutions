class Solution {
    public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> freq;
        int count = 0;
        int l = 0;
        int r = 0;
        while(r < s.size()){
            char c = s[r];
            freq[c]++;
            while (freq[c] > 1){
                freq[s[l]]--;
                l++;
            }
            count = max(count, r - l + 1);
            r++;
        }
        return count;
    }
};