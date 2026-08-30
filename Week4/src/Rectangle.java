public class Rectangle {
    public static void main(String[] args) {
        System.out.println("=======================");

        RectangleModel R1 = new RectangleModel();
        System.out.println(R1);
        
        System.out.println("=======================");

        RectangleModel R2 = new RectangleModel(12);
        System.out.println(R2);
        R2.scale(2);
        System.out.println("Area(new): "+ R2.getArea());
        System.out.println("Perimeter(new): " + R2.getPerimeter());

        System.out.println("=======================");
        
        RectangleModel R3 = new RectangleModel(12,15);
        System.out.println(R3);
        R3.scale(3);
        System.out.println("Area(new): "+ R3.getArea());
        System.out.println("Perimeter(new): " + R3.getPerimeter());

        System.out.println("=======================");
    }
}
