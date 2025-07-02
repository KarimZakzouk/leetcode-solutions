class Solution {
    public int reverse(int x) {
        double solution = 0;
        while(x != 0){
            solution *=10;
            solution +=x%10;
            x /= 10;
        }
        if(solution > Integer.MAX_VALUE || solution < Integer.MIN_VALUE){
            return 0;
        }
        return (int) solution;
        
    }
}