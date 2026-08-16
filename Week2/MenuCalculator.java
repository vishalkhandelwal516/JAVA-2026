import java.util.*;
public class MenuCalculator {
    static void printMenu() 
    {
        System.out.println();
        System.out.println("1- Add");
        System.out.println("2- Subtract");
        System.out.println("3- Multiply");
        System.out.println("4- Divide");
        System.out.println("0- Exit");
    }
    
    static double calculate(double num1, double num2, int choice) 
    {
        double result = 0;
        switch(choice) {
            case 1:
                result = num1+num2;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num1*num2;
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        return result;
    }
    
    public static void main(String[] args) {
        int choice;
        double num1, num2, result;
        Scanner ob = new Scanner(System.in);
        do {
            printMenu();
            System.out.print("Enter choice: ");
            choice = ob.nextInt();
            if(choice == 0) {
                System.out.println("Thank you for using the calculator!");
                break;
            } else if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice! Please try again");
                continue;
            }
            System.out.print("Enter first number: ");
            num1 = ob.nextDouble();
            System.out.print("Enter second number: ");
            num2 = ob.nextDouble();
            result = calculate(num1, num2, choice);
            System.out.println("Result: " + result);
            
        } while(true);
    }
}