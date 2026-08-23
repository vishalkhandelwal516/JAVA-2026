public class ArrayTransformations {
    
    public static void reverseInPlace(int a[]) 
    {
        int left = 0;
        int right = a.length - 1;
        while (left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] reversedCopy(int a[]) {
        int c[] = new int[a.length];
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            c[i] = a[N - 1 - i];
        }
        return c;
    }

    static int removeValue(int a[], int target)
    {
        int N = a.length;
        for (int i=0; i < N; i++)
        {
            if (a[i]==target)
            {
                for(int j=i;j<N-1;j++)
                {
                    a[j]=a[j+1];
                }
                N--;    
            }
        }
        return N;
    }

    static int[] runningSum(int a[])
    {
        int N= a.length;
        for (int i=1; i<N; i++)
        {
            a[i]=a[i]+a[i-1];
        }
        return a;
    
    }
    public static void main(String[] args) 
    {
        int a1[] = new int[]{1,2,3,4,5};
        int a2[] = new int[]{1,2,3,4,5}; // as a1 is getting reverse permanently so i consider using original array stored in a2
        System.out.println("==== Reversed Output ====");
        reverseInPlace(a1);
        System.out.println();

        System.out.println("==== New Reversed copy  ====");
        int[] rev = reversedCopy(a2);
        for (int i = 0; i < rev.length; i++) 
        {
            System.out.print(rev[i] + " ");
        }
        System.out.println();
        
        System.out.println("==== After Removal of target element ====");
        int N = removeValue(a2,5);
        for (int i = 0; i < N; i++)
        {
            System.out.print(a2[i]+ " ");
        }
        System.out.println();
        
        System.out.println("==== Running Sum Output ====");
        int[] sum = runningSum(a2);
        for (int i = 0; i < sum.length; i++) 
        {
            System.out.print(sum[i] + " ");
        }


    }


}