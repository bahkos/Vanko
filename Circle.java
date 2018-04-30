package MyProject;

public class Circle implements IShape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public String getShapeName() {
        return "Circle";
    }

    
    public double getShapeSurface() {        
        return pi * Math.pow(radius, 2);
    }

    public double getShapePerimeter() {
        return 2 * pi * radius;
    }
}