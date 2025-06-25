class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        freq = set()
        l = 0
        count = 0
        for r in range(len(s)):
            while s[r] in freq:
                freq.remove(s[l])
                l+=1
            freq.add(s[r])
            count = max(count, r - l + 1)
        return count