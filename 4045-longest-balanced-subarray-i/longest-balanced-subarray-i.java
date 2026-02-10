class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int even = 0, odd = 0;

            for (int j = i; j < n; j++) {
                if (!set.contains(nums[j])) {
                    set.add(nums[j]);

                    if (nums[j] % 2 == 0)
                        even++;
                    else
                        odd++;
                }

                if (even == odd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}