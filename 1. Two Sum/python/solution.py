class Solution(object):
    def twoSum(self, nums, target):
        num_map = {}
        for i, num in enumerate(nums): # enumerate return [index, value]
            newtarget = target - num
            if newtarget in num_map:
                return [num_map[newtarget], i]
            num_map[num] = i
        return []