abstract class Shape 
{
    private String color; 
    double area; 
    double perimeter; 
    Shape (String c){
        color=c;
    }
    protected abstract void calcArea(); 
    protected abstract void calcPerimeter();
    
    double getArea(){
        return area;
    }
    double getPerimeter(){
        return perimeter;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }
    
    public String toString() {
        return String.format("%s [color=%s, area=%.2f, perimeter=%.2f]",
                getClass().getSimpleName(), color, getArea(), getPerimeter());
    }
}


