public class Course {
    public static void main(String[] args) {

        System.out.println("================================");

        CourseEnrollment C1 = new CourseEnrollment("CSL215", "Intro to java", 10 );
        System.out.println(C1);
        C1.enroll();
        C1.enroll();
        C1.enroll();
        C1.enroll();
        System.out.println("Capacity: " + C1.getCapacity());
        System.out.println("Enrollements: " + C1.getEnrolledCount());
        System.out.println("No. of Seats Available: " + C1.getAvailableSeats());
        C1.withdraw();
        System.out.println("No. of Seats Available: " + C1.getAvailableSeats());
        System.out.println("Is Full? = " + C1.isFull());

        System.out.println("================================");

        CourseEnrollment C2 = new CourseEnrollment("", "Intro to C++", 5 );
        System.out.println(C2);
        C2.enroll();
        C2.enroll();
        C2.enroll();
        C2.enroll();
        C2.enroll();
        System.out.println("Capacity: " + C2.getCapacity());
        System.out.println("Enrollements: " + C2.getEnrolledCount());
        System.out.println("No. of Seats Available: " + C2.getAvailableSeats());
        System.out.println("Is Full?" + C2.isFull());
        C2.withdraw();
        System.out.println("No. of Seats Available: " + C2.getAvailableSeats());
        System.out.println("Is Full?" + C2.isFull());

        System.out.println("================================");

    }   
}
