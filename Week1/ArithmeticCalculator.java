import java.util.*;
public class ArithmeticCalculator {
    static int x, y;
    static void getinput(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x= ob.nextInt();
        System.out.println("Enter Second number: ");
        y= ob.nextInt();
    }
    public static void main(String[] args) {
        getinput();
        System.out.println("Addition: " + (x+y));
        System.out.println("Difference: " + (x-y));
        System.out.println("Product: " + (x*y));
        System.out.println("Remainder: " + (x%y));
        System.out.println("Quotient: " + (x/y));


    }
}
