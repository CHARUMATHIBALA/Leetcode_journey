class Solution {
    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        int c= 0;
        while(result != 0)
        {
            if((result & 1) == 1 )
            {
                c++;
            }
            result >>=1;

        }
        return c;
    }
}