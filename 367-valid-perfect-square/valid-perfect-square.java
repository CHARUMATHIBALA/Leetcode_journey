class Solution {
    public boolean isPerfectSquare(int num) {
        long square = 1;
        for(long i = 0 ; i < num+1 ;i++)
        {
            square = i * i;
            if(num == square  )
            {
                return true;
            }

        }
        return false;
    }
}