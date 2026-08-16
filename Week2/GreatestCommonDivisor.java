import java.util.*;
public class GreatestCommonDivisor
{
    static int getGCD(int num1, int num2)
    {
        while (num2!=0)
        {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = ob.nextInt();
        System.out.print("Enter second number: ");
        num2 = ob.nextInt();
        int y = getGCD(num1,num2);
        System.out.println("GCD of both numbers: " + y);



    }
}

