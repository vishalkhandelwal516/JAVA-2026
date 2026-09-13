public class ShapeManagementApp 
{
    public static void main(String[] args) 
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new circle("Red",5);
        shapes[1] = new rectangle("Blue",4, 6);
        shapes[2] = new square("Green",5);
        shapes[3] = new circle("Yellow",12);
        shapes[4] = new rectangle("Teal",8, 9);

        
        System.out.println("=== Shape Details ===");
        for (Shape i : shapes) 
        {
            System.out.println(i);
            System.out.println("Color: " + i.getColor());
            System.out.println("Area: " + i.getArea());
            System.out.println("Perimeter: " + i.getPerimeter());
            System.out.println();
        }
        
        double totalArea = 0;
        for (Shape i : shapes) 
        {
            totalArea += i.getArea();
        }
        
        System.out.println("=== Total Area: ===");
        System.out.println("Total Area of all shapes: "+ totalArea);
    }
}

