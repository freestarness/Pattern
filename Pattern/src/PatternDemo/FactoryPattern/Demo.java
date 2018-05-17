package PatternDemo.FactoryPattern;

public class Demo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
	}

}
