public class App {
    public static void main(String[] args) throws Exception {
        
        GradingSystem g = new GradingSystem();
        String f= g.gradecalc();
        System.out.println(f);

        LeapCheck L = new LeapCheck();
        Boolean l = L.isLeapYear();
        System.out.println(l);
    }
}
