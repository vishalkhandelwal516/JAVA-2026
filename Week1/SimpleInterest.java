import java.util.Scanner;

public class SimpleInterest {
    static double principal, rate, Si, Final;
    static int tenure;
    
    static void getInput(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        principal= ob.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        rate= ob.nextDouble();
        System.out.print("Enter Tenure: ");
        tenure= ob.nextInt();
    }

    static void calculate(){
        Si= principal * rate * tenure / 100;
        Final = Si+principal;
    }
    public static void main(String[] args) {
        getInput();
        calculate();
        System.out.println("Simple Interest: " + Si);
        System.out.println("Final Amount you will get: " + Final);

    }
}
