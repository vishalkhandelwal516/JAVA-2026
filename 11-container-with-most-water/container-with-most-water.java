class Solution 
{
    public int maxArea(int[] height) 
    {
        int left=0;
        int right=height.length-1;
        int max=0,a1=0,a2=0;
        while(left<right)
        {
            if (height[left]<height[right])
            {
                a1=height[left]*(right-left);
                if(a1>max)
                {
                    max = a1;
                }
                left++;
            } else 
            {
                a2=height[right]*(right-left);
                if(a2>max)
                {
                    max= a2;
                }
                right--;
            }
        }
        return max;
    }
}