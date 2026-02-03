public class Square extends Shape {
    protected double side;

    public Square(double s){
        side = s;
    }
    public double calArea(){
        return side * side;
    }
    public double calPerimeter(){
        return 4*side;
    }
    public String getColor(){
        return "this shape is blue";
    }
    
}
