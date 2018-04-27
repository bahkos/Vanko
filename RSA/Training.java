package oop;

public class Training {
    public static void main(String[] args) {

        
    	String message ="";

        Shape[] shapeType = new Shape[5];

        shapeType[0] = new Shape(0, 0, 0);
        shapeType[1] = new Shape(10, 60, 22);
        shapeType[2] = new Shape(21, 50, 15);
        shapeType[3] = new Shape(10, 60, 22);
        shapeType[4] = new Shape(21, 50, 15);
       

        ShapeType[0].setGear(3);

        for(int i=0; i < Shape.getNumberOfShapes(); i++)
        {
            System.out.println(ShapeRace[i].toString());

    	
    	
   //     double width = 5, length = 7;
   //     Shape rectangle = new Rectangle(width, length);
     //   System.out.println(rectangle.getShapeName() + " " + width + " and length: " + length
       //         + "\nResulting Surface: " + rectangle.getShapeSurface()
         //       + "\nResulting perimeter: " + rectangle.getShapePerimeter() + "\n");

        
     //   double radius = 5;
       // Shape circle = new Circle(radius);
      //  System.out.println(circle.getShapeName() + " radius: " + radius
        //    + "\nResulting Surface: " + circle.getShapeSurface()
          //  + "\nResulting Perimeter: " + circle.getShapePerimeter() + "\n");

       
      //  double a = 5, b = 3, c = 4;
     //   Shape triangle = new Triangle(a,b,c);
      //  System.out.println(triangle.getShapeName() + " sides lengths: " + a + ", " + b + ", " + c
      //          + "\nResulting Surface: " + triangle.getShapeSurface()
     //           + "\nResulting Perimeter: " + triangle.getShapePerimeter() + "\n");
    }
}
}