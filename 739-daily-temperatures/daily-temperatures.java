class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        int[] ans = new int[n];
        int[] nextWarmer = new int[101];
        java.util.Arrays.fill(nextWarmer, Integer.MAX_VALUE);

        for (int i = n - 1; i >= 0; i--)
        {
            int warmerIndex = Integer.MAX_VALUE;

            for (int t = temperatures[i] + 1; t <= 100; t++)
            {
                warmerIndex = Math.min(warmerIndex, nextWarmer[t]);
            }

            if (warmerIndex != Integer.MAX_VALUE)
            {
                ans[i] = warmerIndex - i;
            }

            nextWarmer[temperatures[i]] = i;
        }

        return ans;
    }
}