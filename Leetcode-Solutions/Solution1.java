class Solution {
    public int reverse(int x) {
        int ans = 0, temp = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            if (temp != (ans - (x % 10)) / 10) {
                return 0;
            }
            temp = ans;
            x = x / 10;
        }
        return ans;
    }
}