class Solution(object):

    def longestPalindrome(self, s):
        left, right = 0, 0
        for i in range(len(s)):
            l1, r1 = self.expandingString(s, i, i + 1)
            l2, r2 = self.expandingString(s, i, i)

            if r1 - l1 >= right - left:
                left = l1
                right = r1
            if r2 - l2 >= right - left:
                left = l2
                right = r2
        return s[left:right + 1]
    def expandingString(self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l-=1
            r+=1
        return l+1, r-1