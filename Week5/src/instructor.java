class Instructor extends Person {
    private String[] coursesTaught; // getter
    private int yearsOfExperience; //getter

    public Instructor(String name, String id, String department,String[] coursesTaught, int yearsOfExperience) {
        super(name, id, department);
        this.coursesTaught = coursesTaught;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    @Override
    public String getRole() {
        return "Instructor" ;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Courses: " + coursesTaught.length +
               " | Experience: " + yearsOfExperience + " years";
    }
}
