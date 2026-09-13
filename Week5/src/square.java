public class square extends Shape {
        double side;

        square(String color, double side){
            super(color);
            if (side<0){
                this.side = 1;
            } else {
                this.side = side;
            }   
        calcArea();           
        calcPerimeter();
        }

        @Override
        protected void calcArea(){
            area =side*side;
        }

        @Override
        protected void calcPerimeter(){
            perimeter =4*side;
    }
}
