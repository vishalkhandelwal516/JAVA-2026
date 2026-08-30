public class StudentRecord {
    public static void main(String[] args) throws Exception 
    {

        System.out.println("============================");

        Student S = new Student();
        System.out.println(S);
        System.out.println("Passed Status:"+ S.hasPassed());
        System.out.println("Grade: " + S.getClassification());
        
        System.out.println("============================");


        Student S1 = new Student("Vishal", "25CSU263", 17);

        System.out.println(S1);
        System.out.println("Passed Status:"+ S1.hasPassed());
        System.out.println("Grade: " + S1.getClassification());

        S1.setMark(98);
        System.out.println("Marks Updated: "+ S1.getMark());
        System.out.println("Passed Status(updated):"+ S1.hasPassed());
        System.out.println("Grade (Revised): " + S1.getClassification());

        System.out.println("============================");




    }
}