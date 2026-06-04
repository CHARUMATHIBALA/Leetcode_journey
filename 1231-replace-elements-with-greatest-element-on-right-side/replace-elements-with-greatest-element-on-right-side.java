class Solution {
    public int[] replaceElements(int[] arr) {
      int maxR = -1;
      for(int i = arr.length-1; i >= 0 ;i--)
      {
        int current = arr[i];
        arr[i] = maxR;
        maxR = Math.max(arr[i],current);
      }
      return arr;
    }
}