class Solution {
    public int missingMultiple(int[] nums, int k) {
      int mu = k;
      while(true)
      {
        boolean flag = false;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(mu == nums[i]){
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            return mu;
        }
        mu = mu + k;


      }
       



            
        }
    }
