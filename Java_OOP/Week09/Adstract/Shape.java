public abstract class Shape{    //abstract must have least 1 abstract
    public abstract double calArea();
    public abstract double calPerimeter();
    public String getColor(){   //concrete method
        return "this shape is red";
    }
}