class Solution {
public:
    int reverse(int x) {
        double solution = 0;
        while(x != 0){
            solution *=10;
            solution +=x%10;
            x /= 10;
        }
        if(solution > INT_MAX || solution < INT_MIN){
            return 0;
        }
        return solution;

    }
};