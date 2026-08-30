public class Student 
{
    private String name = " No data fetched !";
    private String studentId = "unallocated";
    private int mark = -1;
    Student(){}
    Student(String name, String studentId, int mark)
    {
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }
    public String toString(){
        return "Name: " + name + " | StudentID: " + studentId + " | Marks: " + mark;
    }
    String getName()
    {
        return name;
    }
    String getStudentId()
    {
        return studentId;
    }
    int getMark()
    {
        return mark;
    }
    boolean setMark(int newMark)
    {
        if (newMark > 100 || newMark < 0){
            System.out.println("Invalid Marks ! Enter Marks between 0 - 100 !");
            return false; 
        } else {
            mark = newMark;
            return true;
        }
    }
    boolean hasPassed()
    {
        if (mark>35)
        {
            return true;
        }
        return false;
    }

    String getClassification()
    {
        if (mark<=100 && mark>=80)
        {
            return "A";
        }
        else if (mark<=79 && mark>=60)
        {
            return "B";
        } else if (mark<=59 && mark>=40)
        {
            return "C";
        } else if (mark<=49 && mark>35)
        {
            return "D";
        } else
        {
            return "Fail / not allocated";
        }
    } 



}
