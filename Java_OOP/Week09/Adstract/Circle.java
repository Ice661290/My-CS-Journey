public  class Circle extends Shape {
    protected double radius;

    public Circle(double r){
        radius = r;
    }
    public double calArea(){
        return Math.PI * radius * radius;
    }
    public double calPerimeter(){
        return 2*Math.PI * radius;
    }
    public String getColor(){
        return "this shape is green";
    }
    
}
