class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int r = 0;
        for(int i = 0; i< k;i++)
        {
            sum = sum +arr[i];
        }
        if(sum/k >= threshold)
        {
            r++;
        }
        for(int i = k ;i< arr.length;i++)
        {
            sum = sum +arr[i]-arr[i-k];
            if(sum/k >= threshold)
            {
                r++;
            }
        }
        return r;
    }
}