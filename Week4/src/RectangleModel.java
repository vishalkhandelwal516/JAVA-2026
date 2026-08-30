public class RectangleModel 
{
    private double width = 1, height =1;
    RectangleModel(){
        this(1);
    }
    RectangleModel(double side){
        this(side,side);
    }
    RectangleModel(double width,double height){
        if (width<=0 || height <=0){
            System.out.println("Width & Height must be greater than 0 !");
            this.width = 1.0;
            this.height = 1.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    public String toString(){
            return "Dimensions: " + width + "*" + height + " | Area: " + getArea() + " | Perimeter: " + getPerimeter() +" | isSquare? =" + isSquare();
        }

    double getArea()
    {
        return width * height;
    }
    double getPerimeter()
    {
        return 2 * (width + height);
    }
    boolean isSquare()
    {
        if (width==height)
        {
            return true;
        }
        return false;
    }

    void scale(double factor)
    {
        if (factor>0)
        {
            width= width*factor;
            height= height*factor;
            System.out.println("Scaled Dimensions by " + factor );
        } else {
            System.out.println("ERROR ! A factor cannot be zero !");
        }
    }


}
