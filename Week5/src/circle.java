public class circle extends Shape
{
    double radius;
    circle(String color,double radius){
        super(color);
        if (radius<0){
            this.radius = 1;
        } else {
            this.radius = radius;
        }
        calcArea();           
        calcPerimeter();

    }
    @Override
    protected void calcArea(){
        area = 3.14*radius*radius;
    }

    @Override
    protected void calcPerimeter(){
        perimeter = 2*3.14*radius;
    }
}