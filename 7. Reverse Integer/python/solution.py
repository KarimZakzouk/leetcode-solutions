class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MAX = 2**31 - 1  #  2147483647
        INT_MIN = -2**31     # -2147483648

        isNegative = False
        if x < 0:
            x = abs(x)
            isNegative = True

        solution = int(str(x)[::-1]) * (-1 if isNegative else 1)
        
        if solution > INT_MAX or solution < INT_MIN:
            return 0
        return solution
        