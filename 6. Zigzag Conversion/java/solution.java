class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int y = 0;
        boolean goingUp = false;

        for (char c : s.toCharArray()) {
            rows[y].append(c);

            if (!goingUp) {
                y++;
                if (y == numRows - 1) goingUp = true;
            } else {
                y--;
                if (y == 0) goingUp = false;
            }
        }

        StringBuilder solution = new StringBuilder();
        for (StringBuilder row : rows) {
            solution.append(row);
        }

        return solution.toString();
    }
}
