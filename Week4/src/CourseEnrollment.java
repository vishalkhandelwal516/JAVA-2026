public class CourseEnrollment 
{
    private String courseCode, title;
    private int capacity, enrolledCount=0;
    CourseEnrollment(){}
    CourseEnrollment(String courseCode, String title, int capacity)
    {
        if (courseCode==null || courseCode.isBlank())
        {
            this.courseCode = "Course code missing !";
        } else {
            this.courseCode = courseCode;
        }
        if (title==null || title.isBlank())
        {
            this.title = " Course name not fetched !";
        } else {
            this.title = title;
        }

        if (capacity<=0)
        {
            System.out.println("Capacity should be positive and non-zero !");
            this.capacity = 0;
        } else {
            this.capacity =  capacity;
        }
    }
    
    public String toString()
    {
        return "Course code: " + courseCode + " | Course name: " + title + " | Capacity: " + capacity;
    }
    boolean enroll()
    {
        if(enrolledCount<capacity){
            enrolledCount++;
            System.out.println("Course Successfully Enrolled !");
            return true;
        }
        System.out.println("Seats Already Full !");
        return false;
    }

    boolean withdraw()
    {
        if(enrolledCount==0){
            System.out.println( "Course not Enrolled !");
            return false;
        }
        System.out.println("Course Successfully Withdrawn !");
        enrolledCount--;
        return true;

    }

    boolean isFull()
    {
        if (enrolledCount==capacity)
        {
            return true;
        }
        return false;
    }

    int getAvailableSeats()
    {
        return capacity-enrolledCount;
    }

    String getCourseCode() {
    return courseCode;
    }

    String getTitle() {
        return title;
    }

    int getCapacity() {
        return capacity;
    }

    int getEnrolledCount(){
        return enrolledCount;
    }
}