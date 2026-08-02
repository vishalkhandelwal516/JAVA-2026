import java.util.Scanner;
public class TempConversion {
    static double celsius, fahrenheit;
    
    static void getInput(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Temp in Celsius: ");
        celsius= ob.nextDouble();
    }
    
    static void calculate(){
        fahrenheit = celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) {
        getInput();
        calculate();
        System.out.println("Temp (in fahrenheit): " + fahrenheit);
    }
}
