class Solution {
public:
    int maxArea(vector<int>& height) {
        int l = 0;
        int r = height.size() - 1;
        int area = min(height[l], height[r]) * (r - l);
        while(l != r){
            if(height[l] <= height[r]){
                l++;
            }
            else if(height[l] > height[r]){
                r--;
            }
            area = max(area, min(height[l], height[r]) * (r - l));
        }
        return area;
    }
};