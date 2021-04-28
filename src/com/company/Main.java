package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 900000;
	Solution s = new Solution();
	System.out.println(s.reverse(number));
    }
}

class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x<0) {
            flag = true;
            x = -x;
        }
        int result = 0;
        while(x > 0)
        {
            if(result>214748364)
            {
                return 0;
            }
            result*=10;
            if(((flag && x%10>8)||(!flag && x%10>7))&&(result==2147483640))
            {
                return 0;
            }
            result+=x%10;
            x = x/10;
        }
        if(flag)
        {
            result = -result;
        }
        return result;
    }
}
