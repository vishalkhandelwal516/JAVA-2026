abstract class Person
{
    private String name; //getter
    private String id; // getter
    private String department; // setter , getter

    public abstract String getRole();
    Person(String name,String id,String department)
    {
        if(name.trim().isEmpty())
        {
            this.name="Unfetched ! ";
        } else 
        {
            this.name=name;
        }

        if(id.trim().isEmpty())
        {
            this.id="Unallocated ! ";
        } else 
        {
            this.id=id;
        }

        if(department.trim().isEmpty())
        {
            this.department="Unallocated ! ";
        } else 
        {
            this.department=department;
        }
    }

    String getName()
    {
        return name;
    }
    String getID()
    {
        return id;
    }
    String getDepartment()
    {
        return department;
    }

    //In case someone chooses to change their department
    void setDepartment(String department)
    {
        this.department=department;
    }

    public String toString() {
        return String.format("%s [Name=%s, Id=%s, Dept=%s, Role: %s]",
                getClass().getSimpleName(), getName(), getID(), getDepartment(), getRole());
    }

}
