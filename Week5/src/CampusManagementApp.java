public class CampusManagementApp {
    public static void main(String[] args) {
        CampusRegistry registry = new CampusRegistry(10);
    }
}

class Person {
    private String id;
    private String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String getId() 
    {
        return id; 
    }
    String getName() 
    { 
        return name; 
    }

    String showDetails() 
    {
        return "ID: " + id + ", Name: " + name;
    }
}

class Student extends Person {
    private int[] marks;
    Student(String id, String name, int[] marks) 
    {
        super(id, name);
        this.marks = marks;
    }

    int[] getMarks() 
    { 
        return marks; 

    }

    double calculateAverageScore() {
        if (marks==null || marks.length==0) 
        {
            return 0;
        }
        int sum = 0;
        for (int i : marks)
        {
            sum += i;
        }

        return (double) sum / marks.length;
    }

    public void display() {
        super.toString();
        System.out.print("Scores: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        
        System.out.print("Avg: " + calculateAverageScore());
    }
}

class Instructor extends Person {
    private String department;

    public Instructor(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() 
    { 
        return department; 
    }

    @Override
    public String showDetails() 
    {
        return super.showDetails() + "Department: " + department;
    }
}

class CampusRegistry {
    private Person[] registry;
    private int count;

    CampusRegistry(int capacity) 
    {
        this.registry = new Person[capacity];
        this.count = 0;
    }

    boolean addPerson(Person person) {
        if (count < registry.length) 
        {
            registry[count] = person;
            count+=1;
            return true;
        }
        return false;
    }

    public void getAll() {
        for (int i = 0; i < count; i++) 
        {
            System.out.println(+ (i + 1) + ": " + registry[i].showDetails());
        }
    }
}

