package oop;

public class Training {
	public static void main(String[] args) {

		IShape[] shapeType = new IShape[3];

		shapeType[0] = new Rectangle(5, 3);
		shapeType[1] = new Triangle(3, 4, 5);
		shapeType[2] = new Circle(2.5);

		for (int i = 0; i < shapeType.length; i++) {
			System.out.printf(shapeType[i].getShapeName() + " Prerimeter : " + shapeType[i].getShapePerimeter() + "\n"
					+ shapeType[i].getShapeName() + " Surfice : " + shapeType[i].getShapeSurface() + "\n");
		}

	}
}
