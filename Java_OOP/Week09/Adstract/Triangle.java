public class Triangle extends Shape {
    protected double base;
    protected double height;

    
    public Triangle(double h,double b) {
        height = h;
        base = b;
    }

    public double calArea(){
        return 0.5 * base * height;
    }
    public double calPerimeter(){
        return Math.sqrt(3)/4 * (height*height);
    }
    public String getColor(){
        return "this shape is yelllow";
    }
}
