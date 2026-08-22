class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int ori = n;
        while(n != 0)
        {
            int x = n% 10;
            sum = sum + x;
            prod = prod * x;
            n = n/10;
        }
        return ori % (sum+prod) ==  0;
    }
}