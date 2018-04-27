package oop;

public class Rectangle implements Shape {
    private final double width, height;

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getShapeName() {
        return "Rectangle";
    }
    
    public double getShapeSurface() {
        return width * height;
    }

    
    public double getShapePerimeter() {
        return 2 * (width + height);
    }

}