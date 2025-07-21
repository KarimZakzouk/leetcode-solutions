class Solution(object):
    def isMatch(self, s, p):
        dp = [[0] * (len(p) + 1) for _ in range(len(s) + 1)]
        dp[0][0] = 1

        for j in range(1, len(p) + 1):
            if p[j - 1] == '*' and j >= 2:
                dp[0][j] = dp[0][j - 2]

        for i in range(1, len(s) + 1):
            for j in range(1, len(p) + 1):
                if s[i - 1] == p[j - 1] or p[j - 1] == '.':
                    dp[i][j] = dp[i - 1][j - 1]
                elif p[j - 1] == '*':
                    dp[i][j] = dp[i][j - 2] 
                    if p[j - 2] == '.' or p[j - 2] == s[i - 1]:
                        dp[i][j] |= dp[i - 1][j]
                else:
                    dp[i][j] = 0

        return dp[len(s)][len(p)] == 1