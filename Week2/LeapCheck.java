import java.util.*;
public class LeapCheck {
    public boolean isLeapYear(){
        int y;
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter Year:");
        y=ob.nextInt();
        if (y%400==0){
            return true;
        } else if (y%100==0){
            return false;
        } else if (y%4==0) {            
            return true;
        } else {
            return false;
        }
    }
}
