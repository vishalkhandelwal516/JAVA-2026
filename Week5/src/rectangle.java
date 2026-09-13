public class rectangle extends Shape{
    double length;
    double width;

    rectangle(String color, double length,double width){
        super(color);
        if (length<0 || width<0){
            this.length = 1;
            this.width = 1;
        } else {
            this.length = length;
            this.width=width;
        }   
        calcArea();           
        calcPerimeter();
    }

    @Override
    protected void calcArea(){
        area =length*width;
    }

    @Override
    protected void calcPerimeter(){
        perimeter =2*(width+length);
    }
}
