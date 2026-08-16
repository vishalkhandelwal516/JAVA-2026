import java.util.*;
public class NumberReversal {
    static int reverseNumber(int number)
    {
        int reversed = 0;
        while (number>0)
        {
            int modulo = number % 10;
            reversed = reversed * 10 + modulo;
            number/=10;
        }
        return reversed;
    }
    public static void main(String[] args) 
    {
        int num;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        num = ob.nextInt();
        int y = reverseNumber(num);
        System.out.println("Reversed is: " + y);

    }
    // any value ending with zero will show no starting with zero in result because 
    // a leading zero in integer get always dropped in java 
}
