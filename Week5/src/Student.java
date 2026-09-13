public class Student extends Person 
{
    private int[] grades; //getter
    private double GPA; // getter
    
    public Student(String name, String id, String department, int[] grades) 
    {
        super(name, id, department);
        this.grades = grades;
        this.GPA = calculateGPA();
    }
    
    private double calculateGPA() 
    {
        if (grades.length==0)
        {
            return 0.0;
        }

        double sum=0;
        for (int i : grades)
        {
            sum += i;
        }
        double average = sum/grades.length;
        return (average/100.0)*10.0;
    }
    
    public double getGPA() 
    {
        return GPA;
    }
    
    public int[] getGrades() 
    {
        return grades;
    }

    @Override
    public String getRole() 
    {
        return "Student";
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | GPA: " + GPA  + "Role: " + getRole();
    }
}
