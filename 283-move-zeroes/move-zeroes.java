class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int N = nums.length;
        int j=0;
        int[] arr1 = new int[N];
        for (int i=0; i<N; i++)
        {
            if(nums[i]!=0)
            {
                arr1[j]=nums[i];
                j++;
            }
            
        }
        
        for (int i=0; i<N; i++)
        {
            nums[i]=arr1[i];
        }
    }
}