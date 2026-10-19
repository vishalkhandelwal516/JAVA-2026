class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList <> ();
        ArrayList <Integer> b=new ArrayList <> ();
        int i,j;
        for(i=0;i<numRows;i++)
        {
            b.clear();
            for(j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    b.add(1);
                }
                else
                {
                    int sum=0;
                    List <Integer> prevRow=a.get(i-1);
                    sum=sum+prevRow.get(j-1)+prevRow.get(j);
                    b.add(sum);
                }
            }
            a.add(new ArrayList<>(b));
        }
        return a;
    }
}