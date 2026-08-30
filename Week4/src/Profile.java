public class Profile {
    private String name;
    private int age;
    private double heightMetres;
    Profile(String name, int age, double heightMetres) 
    {
        if (name == null || name.isBlank()) 
        {
            System.out.println("Name must not be Blank !");
            this.name = "Unallocated";
        } else 
        {
            this.name = name;
        }
        if (age < 0) 
        {
            System.out.println("Age must be positive and non zero !");
            this.age = 1; 
        } else
        {
            this.age = age;
        }
        if (heightMetres <= 0) 
        {
            System.out.println("Height must be positive !");
            this.heightMetres = 0;
        } else 
        {
            this.heightMetres = heightMetres;
        }
    }
     
    public String toString() {
        return "Profile:\n Name: " + name + " | Age: " + age + " | Height: " + heightMetres + "m";
    }
    String getName() 
    {
        return name;
    }

    int getAge() 
    {
        return age;
    }

    double getHeightMetres() 
    {
        return heightMetres;
    }
   
}