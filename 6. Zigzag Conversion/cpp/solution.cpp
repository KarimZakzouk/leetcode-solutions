class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1 || numRows >= s.size()) return s;
        vector<string> rows (numRows);
        int y = 0;
        bool goingUp = false;
        for(auto&c : s){
            rows[y]+=c;
            if (!goingUp) {
                y++;
                if (y >= numRows - 1) {
                    goingUp = !goingUp;
                }
            } else {
                y--;
                if (y <= 0) {
                    goingUp = !goingUp;
                }
            }
        }
        string solution = "";

        for(auto&row: rows){
            solution+=row;
        }
        return solution;
    }
};