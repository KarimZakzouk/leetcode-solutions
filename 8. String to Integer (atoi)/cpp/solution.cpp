class Solution {
public:
    int myAtoi(string s) {
        double solution = 0;
        int i = 0;
        bool isNegative = false;
        while(s[i] == ' '){
            i++;
        }
        if(s[i] == '-' || s[i] == '+'){
            if(s[i] == '-') isNegative = true;
            i++;
        }
        while(s[i] - '0' <= 9 && s[i] - '0' >= 0){
            solution*=10;
            solution += s[i] - '0';
            i++;
        }
        solution = solution * (isNegative ? -1 : 1);
        if(solution > INT_MAX) return INT_MAX;
        else if(solution < INT_MIN) return INT_MIN;
        return solution;
    }
};