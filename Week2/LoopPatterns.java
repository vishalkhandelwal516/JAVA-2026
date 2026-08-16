import java.util.*;
public class LoopPatterns {
    public static void main(String[] args) {
        int size;
        Scanner ob = new Scanner(System.in);
        while(true) {
            System.out.print("Enter size: ");
            size = ob.nextInt();
            
            if(size < 1) {
                System.out.println("Invalid! Size must be >= 1");
            } else {
                break;
            }
        }
        
        System.out.println("======== LOOP 1 =======");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("======== LOOP 2 =======");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n======== LOOP 3 =======");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n======== LOOP 4 =======");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n======== LOOP 5 =======");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}