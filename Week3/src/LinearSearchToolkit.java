public class LinearSearchToolkit 
{
    public boolean contains(int[] values, int target)
    {
        for (int i=0; i<values.length; i++)
        {
            if(values[i]==target)
            {
                return true;
            }
        }  
        return false;
    }


    public int firstIndexOf(int[] values, int target)
    {
        int index = -1;

        for (int i=0; i<values.length; i++)
        {
            if (values[i]==target)
            {
                index = i;
                break;
            }
        } 
        return index;
    }


    public int lastIndexOf(int[] values, int target)
    {
        int Lindex = -1;
        for (int i=values.length-1; i>=0; i--)
        {
            if (values[i]==target)
            {
                Lindex = i;
                break;
            }
        } 
        return Lindex;
    }

    public int countOccurrences(int[] values, int target)
    {
        int count=0;
        for (int i=0; i<values.length; i++)
        {
            if (values[i]==target)
            {
                count++;
            }
        }
        return count;
    }
}
