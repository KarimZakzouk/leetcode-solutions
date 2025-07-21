class Solution(object):
    def maxArea(self, height):
        l = 0
        r = len(height) - 1
        area = min(height[l], height[r]) * (r - l)
        while l != r:
            if  height[l] <= height[r]:
                l+=1
            elif height[l] > height[r]:
                r-=1
            area = max(area, min(height[l], height[r]) * (r - l))
        
        return area