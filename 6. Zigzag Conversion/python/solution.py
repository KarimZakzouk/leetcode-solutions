class Solution(object):
    def convert(self, s, numRows):
        if numRows == 1 or numRows >= len(s): 
            return s
        rows = [''] * numRows
        y = 0
        goingUp = False
        for c in s:
            rows[y]+=c
            if goingUp == False:
                y+=1
                if y == numRows - 1:
                    goingUp = not goingUp
            else:
                y-=1
                if y == 0:
                    goingUp = not goingUp

        solution = ""
        for r in rows:
            solution += r
        
        return solution


        