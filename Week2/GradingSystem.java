import java.util.*;
public class GradingSystem {
    public String gradecalc(){
        double marks;
        Scanner m = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = m.nextDouble();
        while (true) { 
            if (marks<=100 && marks>=0) {
                if (marks>=80 && marks<=100){
                    return "Distinction";
                } else if (marks>=70 && marks<=79){
                   return "Merit";
                } else if (marks>=50 && marks<=69){
                    return "Pass";
                } else if (marks>=0 && marks<=49){
                    return "Fail !";
                }
            } else if (marks<0){
                System.out.println( "Enter marks more than 0: ");
                marks = m.nextDouble();
            } else if (marks>100){
                System.out.println( "Enter marks less than 100: ");
                marks = m.nextDouble();
            }
        }
    }
}
