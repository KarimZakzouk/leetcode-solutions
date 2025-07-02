class Solution {
    public int myAtoi(String s) {
        long solution = 0;
        int i = 0;
        boolean isNegative = false;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-'){
                isNegative = true;
            } 
            i++;
        }
        while(i < s.length() && s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0){
            solution*=10;
            solution += s.charAt(i) - '0';
            i++;
            if(!isNegative && solution > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(isNegative && -solution < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        solution = solution * (isNegative ? -1 : 1);
        return (int)solution;
        
    }
}