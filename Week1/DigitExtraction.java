import java.util.*;

public class DigitExtraction {
public static void main(String[] arg) {
    Scanner n = new Scanner(System.in);
    System.out.print("Enter a 3-Digit Number: ");
    int num = n.nextInt();

    int hundreds = num/100;
    int tens = (num%100)/10;
    int units = num%10;
    System.out.println("Hundreds: " + hundreds);
    System.out.println("Tens:     " + tens);
    System.out.println("Units:    " + units);
    }
}
