class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> freq = new HashSet<>();
        int count = 0;
        int l = 0;
        int r = 0;
        while(r < s.length()){
            char c = s.charAt(r);
            if(freq.contains(c)){
                freq.remove(s.charAt(l));
                l++;
            }
            else{
                freq.add(c);
                count = Math.max(count, r - l + 1);
                r++;
            }
        }
        return count;
    }
}