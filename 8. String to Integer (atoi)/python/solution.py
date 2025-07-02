class Solution(object):
    def myAtoi(self, s):
        s = s.lstrip()

        match = re.match(r'^([+-]?\d+)', s)
        if not match:
            return 0

        num = int(match.group(1))

        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        if num > INT_MAX:
            return INT_MAX
        if num < INT_MIN:
            return INT_MIN
        return num
        