import java.util.*;
public class NumberAnalyzer {
    static int readNumber(Scanner n)
    {
        System.out.println("Enter an Integer: ");
        int number = n.nextInt();   
        return number;
    }
    static boolean isEven(int number)
    {
        if (number%2!=0)
        {
            return false;
        }
        return true;

    }
    static boolean isPositive(int number){
        if (number<0){
            return false;
        }
        return true;
    }
    static int absoluteValue(int number){
        if (number<0){
            return -number;
        }
        return number;
    }
    static int countDigits(int number){
        int count=0;
        if (number==0){
            return 1;
        }
        while (number>0){
            count++;
            number/=10;
        }
        return count;
    }
    static int sumDigits(int number){
        int sum=0;
        if (number==0){
            return 0;
        }
        while (number>0){
            int rem = number % 10;
            sum = sum + rem;
            number/=10;
        }
        return sum;
    }
    static void printReport(int number, boolean even, boolean positive, int digitCount,int digitSum){
        System.out.println("Number : " + number);
        System.out.println("Is Even?: " + even);
        System.out.println("Is Positive?: " + positive);
        System.out.println("Digits Count= " + digitCount);
        System.out.println("Sum of Digits: " + digitSum);
    }
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = readNumber(n);
        boolean even = isEven(number);
        boolean positive = isPositive(number);
        int absolute = absoluteValue(number);
        int digitCount = countDigits(absolute);
        int digitSum = sumDigits(absolute);
        printReport(number,even,positive, digitCount, digitSum);
        n.close();
        



        




    }
}
