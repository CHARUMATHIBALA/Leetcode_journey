class Solution {

    private int findMinPairIndex(List<Integer> nums) {
        int bestSum = Integer.MAX_VALUE;
        int bestIndex = -1;

        for (int i = 0; i < nums.size() - 1; i++) {
            int pairSum = nums.get(i) + nums.get(i + 1);
            if (pairSum < bestSum) {
                bestSum = pairSum;
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    private void mergePairAt(List<Integer> nums, int index) {
        nums.set(index, nums.get(index) + nums.get(index + 1));
        nums.remove(index + 1);
    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }

        int operations = 0;
        while (!isSorted(list)) {
            int index = findMinPairIndex(list);
            mergePairAt(list, index);
            operations++;
        }
        return operations;
    }

    private boolean isSorted(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}