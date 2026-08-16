import java.util.*;
public class PrimeNumber 
{
    static boolean isPrime(int a)
    {
        if(a<2)
        {
            return false;
        } else 
        { 
            for (int i=2; i<=a/2; i++){
                if (a%i==0){
                    return false;
                } 
            }

        }
        return true;
    }
    public static void main(String[] arg) 
    {
        int num;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        num = ob.nextInt();
        isPrime(num);
        if (isPrime(num)==false)
        {
            System.out.println(num + " is not a Prime number");
        } else if (isPrime(num)==true)
        {
            System.out.println(num + " is a Prime number");
        }
    }
}

