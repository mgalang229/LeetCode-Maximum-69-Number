class Solution {
    public int maximum69Number (int num) {
        int temp = 1;
        while (temp * 10 < num) {
            temp *= 10;
        }
        int newNum = 0;
        boolean used = false;
        while (temp > 0) {
            if (num / temp == 6 && !used) {
                newNum = newNum * 10 + 9;
                used = true;
            } else {
                newNum = newNum * 10 + (num / temp);
            }
            num %= temp;
            temp /= 10;
        }
        return newNum;
    }
}
