class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> p = new ArrayList<>();
        for(int i  = 0 ;  i < numRows ;i++)
        {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j = 1 ; j< i;j++)
            {
                int v = p.get(i-1).get(j-1)+ p.get(i-1).get(j);
                row.set(j,v);

                            }
                            p.add(row);
        }
        return p;
    }
}