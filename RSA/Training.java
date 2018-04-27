package oop;

public class Training {
    public static void main(String[] args) {

        
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println(rectangle.getShapeName() + " " + width + " and length: " + length
                + "\nResulting Surface: " + rectangle.getShapeSurface()
                + "\nResulting perimeter: " + rectangle.getShapePerimeter() + "\n");

        
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println(circle.getShapeName() + " radius: " + radius
            + "\nResulting Surface: " + circle.getShapeSurface()
            + "\nResulting Perimeter: " + circle.getShapePerimeter() + "\n");

       
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println(triangle.getShapeName() + " sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Surface: " + triangle.getShapeSurface()
                + "\nResulting Perimeter: " + triangle.getShapePerimeter() + "\n");
    }
}